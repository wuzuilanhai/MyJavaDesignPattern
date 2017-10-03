package com.biubiu.Mediator;

import lombok.Data;

/**
 * @author 张海彪
 * @create 2017-10-03 下午5:40
 */
@Data
public abstract class User {
    protected Mediator mediator;

    protected String name;

    public User(String name) {
        this.name = name;
    }

    protected abstract void sendMessage(String msg);

    protected abstract void getMessage(String msg);
}
