package com.xb.mall.product.client;

import com.xb.mall.product.vo.ProductVo;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * @author baixiaozheng
 * @date 2020/6/9 15:25
 */
@Component
public class ProductServiceClientFallback implements ProductServiceClient {
    @Override
    public List<ProductVo> listForOrder(List<Long> productIds) {
        ProductVo vo = new ProductVo().setId(0L).setProductName("服务已降级").setProductDescription("这里是降级后的返回结果");
        return Arrays.asList(vo);
    }

    @Override
    public ProductVo getProduct(Long id) {
        ProductVo vo = new ProductVo().setId(id).setProductName("服务已降级").setProductDescription("这里是降级后的返回结果");
        return vo;
    }
}
