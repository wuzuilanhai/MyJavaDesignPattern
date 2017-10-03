package com.biubiu.Abstract_Factory;

/**
 * @author 张海彪
 * @create 2017-10-03 下午4:39
 */
public class AmericanFather implements IFather {
    private String name;

    public AmericanFather(String name) {
        this.name = name;
        System.out.println("create a us father.");
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printName() {
        System.out.println(this.getClass().getName() + ":" + this.name);
    }
}