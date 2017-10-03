package com.biubiu.Visitor;

/**
 * @author 张海彪
 * @create 2017-10-03 下午5:19
 */
public class Wheel implements Visitable {
    private String name;

    Wheel(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
