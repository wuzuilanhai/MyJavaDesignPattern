package com.biubiu.Iterator;

/**
 * @author 张海彪
 * @create 2017-10-03 下午5:43
 */
public class MyCollection implements Collection {

    public String[] strings = {"A", "B", "C", "D", "E"};

    @Override
    public Iterator iterator() {
        return new MyIterator(this);
    }

    @Override
    public Object get(int i) {
        return strings[i];
    }

    @Override
    public int size() {
        return strings.length;
    }
}
