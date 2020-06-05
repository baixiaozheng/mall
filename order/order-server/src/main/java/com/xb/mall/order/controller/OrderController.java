package com.xb.mall.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author baixiaozheng
 * @date 2020/6/5 11:23
 */

@RestController
@RequestMapping("order")
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("products")
    public String products(){
        return restTemplate.getForObject("http://127.0.0.1:9001/product/listForOrder?productIds=1,2", String.class);
    }



}
