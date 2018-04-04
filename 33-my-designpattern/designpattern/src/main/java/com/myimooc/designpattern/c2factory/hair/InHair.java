package com.myimooc.designpattern.c2factory.hair;

/**
 * @author zc
 * @version 1.0 2017-08-27
 * @describe 中偏分发型
 */
public class InHair implements HairInterface {

    @Override
    public void draw() {
        System.out.println("中偏分发型");
    }
}
