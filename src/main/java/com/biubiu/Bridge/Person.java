package com.biubiu.Bridge;

/**
 * @author 张海彪
 * @create 2017-10-03 下午3:03
 */
public abstract class Person {

    //吃行为抽象为接口，使之与具体对象解耦
    protected Eatable eatable;

    public Eatable getEatable() {
        return eatable;
    }

    public void setEatable(Eatable eatable) {
        this.eatable = eatable;
    }
}
