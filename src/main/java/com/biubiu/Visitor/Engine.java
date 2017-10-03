package com.biubiu.Visitor;

/**
 * @author 张海彪
 * @create 2017-10-03 下午5:19
 */
public class Engine implements Visitable {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
