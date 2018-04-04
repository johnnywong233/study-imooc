package com.myimooc.designpattern.c2factory.hair;

/**
 * @author zc
 * @version 1.0 2017-08-27
 * @describe 左偏分发型
 */
public class LeftHair implements HairInterface {

    /**
     * 画一个左偏分发型
     */
    @Override
    public void draw() {
        System.out.println("左偏分发型");
    }
}
