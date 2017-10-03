package com.biubiu.Visitor;

/**
 * @author 张海彪
 * @create 2017-10-03 下午5:17
 */
public interface Visitor {
    void visit(Wheel wheel);

    void visit(Engine engine);

    void visit(Body body);

    void visit(Car car);
}
