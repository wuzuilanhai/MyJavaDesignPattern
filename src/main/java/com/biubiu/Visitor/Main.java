package com.biubiu.Visitor;

/**
 * @author 张海彪
 * @create 2017-10-03 下午5:23
 */
public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Visitor visitor = new PrintVisitor();
        car.accept(visitor);
    }
}
