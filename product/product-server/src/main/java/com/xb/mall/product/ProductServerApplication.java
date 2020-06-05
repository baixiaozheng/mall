package com.xb.mall.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author baixiaozheng
 * @date 2020/6/4 18:52
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ProductServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProductServerApplication.class, args);
    }
}
