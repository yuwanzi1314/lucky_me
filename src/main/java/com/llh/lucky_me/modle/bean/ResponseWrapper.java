package com.llh.lucky_me.modle.bean;

import lombok.Data;

@Data
public class ResponseWrapper {
    private String statusCode;
    private String message;
    private Object data;

    private ResponseWrapper(String statusCode, String message, Object data) {
        this.statusCode = statusCode;
        this.message = message;
        this.data = data;
    }

    //成功只有一种情况,其余都不是成功,还是说进入程序就是成功,不是这样
    //还有一个问题,code,message到底能不能和业务有关系,我倾向于有
    public static ResponseWrapper success(String message, Object data) {
        return new ResponseWrapper("0000", message, data);
    }

    public static ResponseWrapper fail(String statusCode, String message, Object data) {
        return new ResponseWrapper(statusCode, message, data);
    }
}
