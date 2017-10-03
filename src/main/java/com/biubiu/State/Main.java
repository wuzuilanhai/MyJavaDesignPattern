package com.biubiu.State;

/**
 * @author 张海彪
 * @create 2017-10-03 下午6:09
 */
public class Main {
    public static void main(String[] args) {
        StateContext stateContext = new StateContext(new WalkState());
        stateContext.execute();
        stateContext.execute();
        stateContext.execute();
        stateContext.execute();
        stateContext.execute();
    }
}
