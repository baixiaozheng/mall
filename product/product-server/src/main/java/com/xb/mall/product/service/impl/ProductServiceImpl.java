package com.xb.mall.product.service.impl;

import com.xb.mall.product.entity.Product;
import com.xb.mall.product.enums.ProductStatus;
import com.xb.mall.product.repository.ProductRepository;
import com.xb.mall.product.service.ProductService;
import com.xb.mall.product.vo.DeductStockVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author baixiaozheng
 * @date 2020/6/4 20:05
 */
@Service
public class ProductServiceImpl implements ProductService {

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
}
