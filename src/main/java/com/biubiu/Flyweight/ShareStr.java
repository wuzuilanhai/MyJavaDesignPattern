package com.biubiu.Flyweight;

/**
 * @author 张海彪
 * @create 2017-10-03 下午2:52
 */
public class ShareStr implements IFlyweight {

    //内部状态str作为成员变量，共享的.
    private String str;

    public ShareStr(String str) {
        this.str = str;
    }

    @Override
    public void setId(int id) {
        System.out.println("str: " + str + "id:" + id);
    }
}
