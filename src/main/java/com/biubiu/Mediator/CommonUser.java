package com.biubiu.Mediator;

/**
 * @author 张海彪
 * @create 2017-10-03 下午5:44
 */
public class CommonUser extends User {
    public CommonUser(String name) {
        super(name);
    }

    @Override
    protected void sendMessage(String msg) {
        this.mediator.operation(this, msg);
    }

    @Override
    protected void getMessage(String msg) {
        System.out.println(this.getName() + " get msg:" + msg);
    }
}
