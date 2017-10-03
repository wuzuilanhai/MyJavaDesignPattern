package com.biubiu.State;

/**
 * @author 张海彪
 * @create 2017-10-03 下午6:07
 */
public class StateContext {
    IState state;

    public StateContext(IState state) {
        this.state = state;
    }

    public void execute(){
        this.state.execute(this);
    }

    public IState getState() {
        return state;
    }

    public void setState(IState state) {
        this.state = state;
    }
}
