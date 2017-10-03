package com.biubiu.Singleton;

/**
 * @author 张海彪
 * @create 2017-10-03 下午1:25
 **/
public class InnerClassMyPrinter {
    private static class MyPrinterHolder {
        private static InnerClassMyPrinter innerClassMyPrinter = new InnerClassMyPrinter();
    }

    private InnerClassMyPrinter() {
        System.out.println("implements3: created a MyPrint instance.");
    }

    public static InnerClassMyPrinter getInstance() {
        return MyPrinterHolder.innerClassMyPrinter;
    }

    public static void testPrint() {
        System.out.println("hello!");
    }

    public void print(String str) {
        System.out.println(str);
    }
}
