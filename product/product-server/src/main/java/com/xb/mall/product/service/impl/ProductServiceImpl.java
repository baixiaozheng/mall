package com.xb.mall.product.service.impl;

import com.xb.mall.product.entity.Product;
import com.xb.mall.product.enums.ProductStatus;
import com.xb.mall.product.repository.ProductRepository;
import com.xb.mall.product.service.ProductService;
import com.xb.mall.product.vo.DeductStockVo;
import com.xb.mall.product.vo.ProductVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @author baixiaozheng
 * @date 2020/6/4 20:05
 */
@Service
public class ProductServiceImpl implements ProductService {


    @Value("${server.port}")
    private int port;
    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> findByProductStatus(ProductStatus status) {
        return productRepository.findByProductStatus(status);
    }

    @Override
    @Transactional
    public List<Product> deductStock(List<DeductStockVo> deductStockVos){
        return null;
    }

    @Override
    public List<ProductVo> listByIds(List<Long> ids) {
        List<Product> products = productRepository.findByIdIn(ids);
        List<ProductVo> vos = products.stream().map(e -> {
            ProductVo vo = new ProductVo();
            BeanUtils.copyProperties(e, vo);
            vo.setProductDescription(vo.getProductDescription()+" from port : "+port );
            return vo;
        }).collect(Collectors.toList());
        return vos;
    }

    @Override
    public ProductVo getById(Long id) {
        Optional<Product> optional = productRepository.findById(id);
        if(optional.isPresent()){
            ProductVo vo = new ProductVo();
            BeanUtils.copyProperties(optional.get(), vo);
            return vo;
        }
        return null;
    }
}
