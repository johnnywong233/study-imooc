package com.myimooc.seckill.dto;

import com.myimooc.seckill.entity.SuccessSeckilled;
import com.myimooc.seckill.enums.SeckillStatEnum;

/**
 * @author zc
 * @version 1.0 2017-08-23
 * @describe 封装秒杀执行后结果
 */
public class SeckillExecution {

    private long seckillId;
    // 秒杀执行结果状态
    private int state;
    // 状态标识
    private String stateInfo;
    // 秒杀成功对象
    private SuccessSeckilled successSeckilled;

    public SeckillExecution(long seckillId, SeckillStatEnum statEnum, SuccessSeckilled successSeckilled) {
        this.seckillId = seckillId;
        this.state = statEnum.getState();
        this.stateInfo = statEnum.getStateInfo();
        this.successSeckilled = successSeckilled;
    }

    public SeckillExecution(long seckillId, SeckillStatEnum statEnum) {
        this.seckillId = seckillId;
        this.state = statEnum.getState();
        this.stateInfo = statEnum.getStateInfo();
    }

    @Override
    public String toString() {
        return "SeckillExecution{" +
                "seckillId=" + seckillId +
                ", state=" + state +
                ", stateInfo='" + stateInfo + '\'' +
                ", successSeckilled=" + successSeckilled +
                '}';
    }

    public long getSeckillId() {
        return seckillId;
    }

    public void setSeckillId(long seckillId) {
        this.seckillId = seckillId;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getStateInfo() {
        return stateInfo;
    }

    public void setStateInfo(String stateInfo) {
        this.stateInfo = stateInfo;
    }

    public SuccessSeckilled getSuccessSeckilled() {
        return successSeckilled;
    }

    public void setSuccessSeckilled(SuccessSeckilled successSeckilled) {
        this.successSeckilled = successSeckilled;
    }
}
