package com.biubiu.Iterator;

/**
 * @author 张海彪
 * @create 2017-10-03 下午5:43
 */
public interface Iterator {
    Object previous();

    Object next();

    boolean hasNext();

    Object first();
}
