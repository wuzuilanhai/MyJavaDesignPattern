package com.biubiu.Observer;

/**
 * @author 张海彪
 * @create 2017-10-03 下午6:23
 */
public class ConcreteSubject extends Subject {

    private double value;

    public double getValue() {
        return value;
    }

    @Override
    public void change(double value) {
        this.value = value;
        System.out.println("original value:" + value);
        this.notifyAllObservers(value);
    }
}
