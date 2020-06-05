package com.xb.mall.product.enums;

/**
 * @author baixiaozheng
 * @date 2020/6/4 19:51
 */
public enum ProductStatus {

    ON(1,"上架"),
    OFF(0,"下架"),
    ;
    private Integer code;
    private String status;

    ProductStatus(Integer code, String status) {
        this.code = code;
        this.status = status;
    }


}
