package com.biubiu.State;

/**
 * @author 张海彪
 * @create 2017-10-03 下午6:08
 */
public class DriveState implements IState {
    @Override
    public void execute(StateContext stateContext) {
        System.out.println("driving。。。");
        stateContext.setState(new WalkState());
    }
}
