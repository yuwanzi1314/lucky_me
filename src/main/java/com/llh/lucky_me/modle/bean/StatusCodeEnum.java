package com.llh.lucky_me.modle.bean;

import lombok.AllArgsConstructor;

/**
 * 全局性
 */
public enum StatusCodeEnum {
    /**
     * 程序报错
     */
    fail("9999"),
    /**
     * 参数为空
     */
    param_blank("8888");

    private String statusCode;
    private StatusCodeEnum(String statusCode) {
        this.statusCode = statusCode;
    }
}
