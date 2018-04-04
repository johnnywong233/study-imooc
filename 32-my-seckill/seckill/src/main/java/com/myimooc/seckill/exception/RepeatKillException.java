package com.myimooc.seckill.exception;

/**
 * @author zc
 * @version 1.0 2017-08-23
 * @describe 重复秒杀异常（运行期异常）
 */
public class RepeatKillException extends SeckillException {

    private static final long serialVersionUID = 1L;

    public RepeatKillException(String message) {
        super(message);
    }

    public RepeatKillException(String message, Throwable cause) {
        super(message, cause);
    }
}
