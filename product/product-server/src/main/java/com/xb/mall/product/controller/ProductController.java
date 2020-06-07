package com.xb.mall.product.controller;

import com.xb.mall.product.entity.Product;
import com.xb.mall.product.enums.ProductStatus;
import com.xb.mall.product.service.ProductService;
import com.xb.mall.product.vo.ProductVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author baixiaozheng
 * @date 2020/6/4 20:36
 */
@RestController
@RequestMapping(value = "product", produces = MediaType.APPLICATION_JSON_VALUE)
@Slf4j
public class ProductController {


    @Autowired
    private ProductService productService;

    @GetMapping("list")
    public List<Product> list() {
        return productService.findByProductStatus(ProductStatus.ON);
    }

    @GetMapping(value = "listForOrder")
    public List<ProductVo> listForOrder(@RequestParam List<Long> productIds){

        List<ProductVo>  vos = productService.listByIds(productIds);
        return vos;
    }
}
