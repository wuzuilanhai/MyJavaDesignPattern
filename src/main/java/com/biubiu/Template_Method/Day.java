package com.biubiu.Template_Method;

/**
 * @author 张海彪
 * @create 2017-10-03 下午5:50
 */
public abstract class Day {
    public void getUp() {
        System.out.println("get up~");
    }

    public abstract void breakfast();

    public abstract void goToWork();

    public abstract void working();

    public abstract void lunch();

    public abstract void goHome();

    public abstract void supper();

    public void sleep() {
        System.out.println("sleep~");
    }

    //模板方法
    public final void process() {
        getUp();
        breakfast();
        goToWork();
        working();
        lunch();
        working();
        goHome();
        supper();
        sleep();
    }
}
