package com.myimooc.seckill.exception;

/**
 * @author zc
 * @version 1.0 2017-08-23
 * @describe 秒杀相关业务异常异常
 */
public class SeckillException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public SeckillException(String message) {
        super(message);
    }

    public SeckillException(String message, Throwable cause) {
        super(message, cause);
    }
}
