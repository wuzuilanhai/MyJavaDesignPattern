package com.biubiu.Template_Method;

/**
 * @author 张海彪
 * @create 2017-10-03 下午5:51
 */
public class ProgrammerDay extends Day {

    @Override
    public void breakfast() {
        System.out.println("breakfast:noodle~");

    }

    @Override
    public void goToWork() {
        System.out.println("goToWork:drive car~");

    }

    @Override
    public void working() {
        System.out.println("working: coding~");

    }

    @Override
    public void lunch() {
        System.out.println("lunch: eat rice~");

    }

    @Override
    public void goHome() {
        System.out.println("goHome: walk~");
    }

    @Override
    public void supper() {
        System.out.println("supper: rice~");
    }
}
