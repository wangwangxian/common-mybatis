package com.qds.common.mybatis.exception;

public class BaseServiceNotFoundException extends RuntimeException{

    public BaseServiceNotFoundException(String message) {
        super(message);
    }
}
