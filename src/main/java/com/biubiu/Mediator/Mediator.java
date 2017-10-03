package com.biubiu.Mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 张海彪
 * @create 2017-10-03 下午5:39
 */
public abstract class Mediator {
    protected List<User> userList;

    public Mediator() {
        userList = new ArrayList<User>();
    }

    public void addUser(User user) {
        user.setMediator(this);
        this.userList.add(user);
    }

    public abstract void operation(User user, String msg);

}
