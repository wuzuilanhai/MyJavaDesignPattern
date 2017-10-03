package com.biubiu.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 张海彪
 * @create 2017-10-03 下午6:20
 */
public abstract class Subject {
    private List<Observer> observers = new ArrayList<>();

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void detach(Observer observer) {
        observers.remove(observer);
    }

    public void notifyAllObservers(double value) {
        for (Observer observer : observers) {
            observer.update(value);
        }
    }

    public abstract void change(double value);

}
