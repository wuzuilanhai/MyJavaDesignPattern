package com.biubiu.Responsibility_Chain;

/**
 * @author 张海彪
 * @create 2017-10-03 下午5:55
 */
public abstract class Handler {
    protected Handler next;

    public Handler getNext() {
        return next;
    }

    public void setNext(Handler next) {
        this.next = next;
    }

    public abstract void handleRequest(String value);
}
