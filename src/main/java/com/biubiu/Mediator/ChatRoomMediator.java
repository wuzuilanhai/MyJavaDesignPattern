package com.biubiu.Mediator;

/**
 * @author 张海彪
 * @create 2017-10-03 下午5:43
 */
public class ChatRoomMediator extends Mediator {
    @Override
    public void operation(User user, String msg) {
        System.out.println(user.getName() + "send a msg : " + msg);
        for (User userTmp : this.userList) {
            userTmp.getMessage(msg);
        }
    }
}
