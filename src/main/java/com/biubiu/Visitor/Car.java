package com.biubiu.Visitor;

/**
 * @author 张海彪
 * @create 2017-10-03 下午5:20
 */
public class Car implements Visitable {
    private Engine engine = new Engine();
    private Body body = new Body();
    private Wheel[] wheels = {new Wheel("front left"),
            new Wheel("front right"),
            new Wheel("back left"),
            new Wheel("back right")};

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
        engine.accept(visitor);
        body.accept(visitor);
        for (int i = 0; i < wheels.length; ++i)
            wheels[i].accept(visitor);
    }
}
