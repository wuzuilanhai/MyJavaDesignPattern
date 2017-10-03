package com.biubiu.Flyweight;

/**
 * @author 张海彪
 * @create 2017-10-03 下午2:56
 */
public class Main {
    public static void main(String[] args) {
        FlyweightFactory factory = new FlyweightFactory();

        ShareStr hello = (ShareStr) factory.getInstance("hello");
        hello.setId(1);

        ShareStr hello2 = (ShareStr) factory.getInstance("hello");
        hello.setId(2);

        ShareStr test = (ShareStr) factory.getInstance("test");
        hello.setId(3);

        System.out.println(hello);
        System.out.println(hello2);
        System.out.println(hello.equals(hello2));

        System.out.println(test);
        System.out.println(hello.equals(test));
    }
}
