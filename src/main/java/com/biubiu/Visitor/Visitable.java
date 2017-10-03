package com.biubiu.Visitor;

/**
 * @author 张海彪
 * @create 2017-10-03 下午5:18
 */
public interface Visitable {
    void accept(Visitor visitor);
}
