package com.biubiu.Abstract_Factory;

/**
 * @author 张海彪
 * @create 2017-10-03 下午4:40
 */
public class ChineseFather implements IFather {
    private String name;

    public ChineseFather(String name) {
        this.name = name;
        System.out.println("create a cn father.");
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