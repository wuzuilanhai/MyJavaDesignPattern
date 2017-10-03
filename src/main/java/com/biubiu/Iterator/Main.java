package com.biubiu.Iterator;

/**
 * @author 张海彪
 * @create 2017-10-03 下午5:43
 */
public class Main {
    public static void main(String[] args) {
        Collection collection = new MyCollection();
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
