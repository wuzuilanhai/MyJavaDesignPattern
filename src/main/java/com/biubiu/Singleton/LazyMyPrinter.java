package com.biubiu.Singleton;

/**
 * @author 张海彪
 * @create 2017-10-03 下午1:22
 **/
public class LazyMyPrinter {
    private static LazyMyPrinter lazyMyPrinter = null;

    private LazyMyPrinter() {
        System.out.println("implements2: created a MyPrint instance.");
    }

    public static synchronized LazyMyPrinter getInstance() {
        if (lazyMyPrinter == null) {
            lazyMyPrinter = new LazyMyPrinter();
        }
        return lazyMyPrinter;
    }

}
