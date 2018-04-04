package com.imooc.pattern.template;

/*
 * ������࣬Ϊ���������ṩһ���㷨���
 * 
 * ��������
 */
public abstract class RefreshBeverage {

    /*
     * �Ʊ����ϵ�ģ�巽��
     * ��װ���������๲ͬ��ѭ���㷨���
     */
    public final void prepareBeverageTemplate() {
        //����1 ��ˮ���
        boilWater();
        //����2 ��������
        brew();
        //����3 �����ϵ��뱭��
        pourInCup();
        if (isCustomerWantsCondiments()) {
            //����4 �����ζ��
            addCondiments();
        }
    }

    /*
     * Hook, ���Ӻ������ṩһ��Ĭ�ϻ�յ�ʵ��
     * ���������������о����Ƿ�ҹ��Լ���ιҹ�
     * ѯ���û��Ƿ�������
     */
    protected boolean isCustomerWantsCondiments() {
        return true;
    }

    /*
     * ������������ˮ���
     */
    private void boilWater() {
        System.out.println("��ˮ���");
    }

    /*
     * ���������������ϵ��뱭��
     */
    private void pourInCup() {
        System.out.println("�����ϵ��뱭��");
    }

    /*
     * ����Ļ�����������������
     */
    protected abstract void brew();


    /*
     * ����Ļ�������, �����ζ��
     */
    protected abstract void addCondiments();


}
