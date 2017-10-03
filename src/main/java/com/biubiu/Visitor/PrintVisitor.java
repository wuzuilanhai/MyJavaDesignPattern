package com.biubiu.Visitor;

/**
 * @author 张海彪
 * @create 2017-10-03 下午5:21
 */
public class PrintVisitor implements Visitor {
    @Override
    public void visit(Wheel wheel) {
        System.out.println("Visiting " + wheel.getName() + " wheel");
    }

    @Override
    public void visit(Engine engine) {
        System.out.println("Visiting engine");
    }

    @Override
    public void visit(Body body) {
        System.out.println("Visiting body");
    }

    @Override
    public void visit(Car car) {
        System.out.println("Visiting car");
    }
}
