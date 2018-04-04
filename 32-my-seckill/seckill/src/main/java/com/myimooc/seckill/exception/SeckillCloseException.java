package com.myimooc.seckill.exception;

/**
 * @author zc
 * @version 1.0 2017-08-23
 * @describe 秒杀关闭异常（运行期异常）
 */
public class SeckillCloseException extends SeckillException {

    private static final long serialVersionUID = 1L;

    public SeckillCloseException(String message) {
        super(message);
    }

    public SeckillCloseException(String message, Throwable cause) {
        super(message, cause);
    }
}
