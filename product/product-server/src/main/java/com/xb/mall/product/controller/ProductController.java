package com.xb.mall.product.controller;

import com.xb.mall.product.entity.Product;
import com.xb.mall.product.enums.ProductStatus;
import com.xb.mall.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author baixiaozheng
 * @date 2020/6/4 20:36
 */
@RestController
@RequestMapping("product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("list")
    public List<Product> list() {
        return productService.findByProductStatus(ProductStatus.ON);
    }
}
