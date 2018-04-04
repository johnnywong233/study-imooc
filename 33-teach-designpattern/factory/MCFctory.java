package com.sunny.project;

/**
 * ʥ��ϵ�мӹ���
 *
 * @author Administrator
 */
public class MCFctory implements PersonFactory {

    @Override
    public Boy getBoy() {
        return new MCBoy();
    }

    @Override
    public Girl getGirl() {
        return new MCGirl();
    }

}
