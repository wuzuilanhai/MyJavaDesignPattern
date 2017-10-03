package com.biubiu.Strategy;

/**
 * @author 张海彪
 * @create 2017-10-03 下午6:14
 */
public class Main {
    public static void main(String[] args) {
        Context context = null;
        context = new Context(new WalkStrategy());
        context.execute();
        context = new Context(new DriveStrategy());
        context.execute();
    }
}
