package com.xb.mall.order.controller;

import com.xb.mall.product.client.ProductServiceClient;
import com.xb.mall.product.vo.ProductVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * @author baixiaozheng
 * @date 2020/6/5 11:23
 */

@RestController
@RequestMapping(value = "order", produces = MediaType.APPLICATION_JSON_VALUE)
public class OrderController {

    @Autowired
    private ProductServiceClient productServiceClient;

    @GetMapping(value = "products")
    public List<ProductVo> products(){
        List<ProductVo> vos = productServiceClient.listForOrder(Arrays.asList(1L,2L));
        return vos;
    }
}
