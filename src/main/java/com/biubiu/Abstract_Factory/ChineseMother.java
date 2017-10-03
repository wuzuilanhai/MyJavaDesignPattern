package com.biubiu.Abstract_Factory;

/**
 * @author 张海彪
 * @create 2017-10-03 下午4:40
 */
public class ChineseMother implements IMother {
    private String name;

    public ChineseMother(String name) {
        this.name = name;
        System.out.println("create a cn mother.");
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
