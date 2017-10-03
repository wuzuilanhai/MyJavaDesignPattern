package com.biubiu.Factory_Method;

/**
 * @author 张海彪
 * @create 2017-10-03 下午1:49
 **/
public class AmericanFather extends Father {
    public AmericanFather(String name) {
        this.setName(name);
    }

    @Override
    public void printName() {
        System.out.println(this.getClass().getName() + ":" + this.getName());
    }
}
