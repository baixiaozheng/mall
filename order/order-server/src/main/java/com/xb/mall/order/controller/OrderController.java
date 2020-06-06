package com.xb.mall.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author baixiaozheng
 * @date 2020/6/5 11:23
 */

@RestController
@RequestMapping(value = "order", produces = MediaType.APPLICATION_JSON_VALUE)
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;

    //public static final String BASE_URL="http://127.0.0.1:9001";
    public static final String BASE_URL="http://MALL-PRODUCT-SERVER";

    @GetMapping(value = "products")
    public String products(){
        String result = restTemplate.getForObject(BASE_URL+"/product/listForOrder?productIds=1,2", String.class);
        return result;
    }

}
