package com.xb.mall.product.client;

import com.xb.mall.product.vo.ProductVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author baixiaozheng
 * @date 2020/6/6 19:43
 */

@FeignClient(value = "mall-product-server", fallback = ProductServiceClientFallback.class)
public interface ProductServiceClient {

    @GetMapping("product/listForOrder")
    List<ProductVo> listForOrder(@RequestParam("productIds") List<Long> productIds); //注意给参数加注解，不然会报405错误

    @GetMapping("product/get/{id}")
    ProductVo getProduct(@PathVariable("id") Long id);
}
