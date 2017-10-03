package com.biubiu.Observer;

/**
 * @author 张海彪
 * @create 2017-10-03 下午6:26
 */
public class Main {
    public static void main(String[] args) {
        Subject subject = new ConcreteSubject();

        new SubObserver(subject);
        new PlusObserver(subject);

        subject.change(3.0);
        subject.change(10.2);
    }
}
