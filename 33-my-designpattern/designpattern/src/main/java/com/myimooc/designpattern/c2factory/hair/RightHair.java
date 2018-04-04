package com.myimooc.designpattern.c2factory.hair;

/**
 * @author zc
 * @version 1.0 2017-08-27
 * @describe 右偏分发型
 */
public class RightHair implements HairInterface {

    /**
     * 画一个右偏分发型
     */
    @Override
    public void draw() {
        System.out.println("右偏分发型");
    }

}
