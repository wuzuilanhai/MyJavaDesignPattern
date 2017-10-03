package com.biubiu.Abstract_Factory;

/**
 * @author 张海彪
 * @create 2017-10-03 下午4:40
 */
public class AmericanMother implements IMother {
    private String name;

    public AmericanMother(String name) {
        this.name = name;
        System.out.println("create a us mother.");
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
