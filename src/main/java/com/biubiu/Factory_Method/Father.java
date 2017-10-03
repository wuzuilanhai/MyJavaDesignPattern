package com.biubiu.Factory_Method;

/**
 * @author 张海彪
 * @create 2017-10-03 下午1:47
 **/
public abstract class Father {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void printName();
}
