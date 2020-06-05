package com.xb.mall.product.service;

import com.xb.mall.product.entity.Product;
import com.xb.mall.product.enums.ProductStatus;
import com.xb.mall.product.vo.DeductStockVo;

import java.util.List;

/**
 * @author baixiaozheng
 * @date 2020/6/4 19:50
 */
public interface ProductService {

    /**
     * 根据状态查询商品列表
     * @param status 状态
     * @return 商品列表
     */
    List<Product> findByProductStatus(ProductStatus status);

    /**
     * 扣库存
     * @param deductStockVos 扣库存对象
     * @return 商品
     */
    List<Product> deductStock(List<DeductStockVo> deductStockVos);
}
