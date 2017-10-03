package com.biubiu.Composite;

/**
 * @author 张海彪
 * @create 2017-10-03 下午3:10
 */
public abstract class File {
    protected String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void showFileName();
}
