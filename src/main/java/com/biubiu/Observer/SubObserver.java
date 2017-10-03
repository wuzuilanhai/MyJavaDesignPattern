package com.biubiu.Observer;

/**
 * @author 张海彪
 * @create 2017-10-03 下午6:24
 */
public class SubObserver extends Observer {

    public SubObserver(Subject subject) {
        subject.attach(this);
    }

    @Override
    public void update(double value) {
        System.out.println("After sub: "+ (--value));
    }
}
