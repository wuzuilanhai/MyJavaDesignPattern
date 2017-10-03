package com.biubiu.Strategy;

/**
 * @author 张海彪
 * @create 2017-10-03 下午6:13
 */
public class Context {
    IStrategy strategy;

    public Context(IStrategy strategy) {
        this.strategy = strategy;
    }

    public void execute() {
        this.strategy.execute();
    }
}
