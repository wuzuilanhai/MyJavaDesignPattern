package com.biubiu.Singleton;

/**
 * @author 张海彪
 * @create 2017-10-03 下午1:20
 **/
public class MyPrinter {

    private static MyPrinter myPrinter=new MyPrinter();

    private MyPrinter(){

    }

    public static MyPrinter getInstance(){
        return myPrinter;
    }

}
