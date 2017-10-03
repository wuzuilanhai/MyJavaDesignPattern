package com.biubiu.Iterator;

/**
 * @author 张海彪
 * @create 2017-10-03 下午5:43
 */
public interface Collection {
    Iterator iterator();

    Object get(int i);

    int size();
}
