package com.xb.mall.product.vo;

import com.xb.mall.product.enums.ProductStatus;
import lombok.Data;
import lombok.experimental.Accessors;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author baixiaozheng
 * @date 2020/6/5 15:13
 */
@Data
@Accessors(chain = true)
public class ProductVo {

    private Long id;

    /**
     * 商品名
     */
    private String productName;

    /**
     * 单价
     */
    private BigDecimal productPrice;

    /**
     * 库存
     */
    private Integer productStock;

    /**
     * 商品描述
     */
    private String productDescription;

    /**
     * icon
     */
    private String productIcon;

    /**
     * 商品状态
     */
    private ProductStatus productStatus;

    private Date createTime;

    private Date updateTime;
}
