package com.xb.mall.product.client;

import com.xb.mall.product.vo.ProductVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author baixiaozheng
 * @date 2020/6/6 19:43
 */
@RequestMapping("product")
@FeignClient(value = "mall-product-server")
public interface ProductServiceClient {

    @GetMapping("listForOrder")
    List<ProductVo> listForOrder(@RequestParam("productIds") List<Long> productIds); //注意给参数加注解，不然会报405错误
}
