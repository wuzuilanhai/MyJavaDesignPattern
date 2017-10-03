package com.biubiu.Responsibility_Chain;

/**
 * @author 张海彪
 * @create 2017-10-03 下午5:57
 */
public class CountyHandler extends Handler {
    @Override
    public void handleRequest(String value) {
        if ("county".equals(value)) {
            System.out.println("County: handled~");
        } else if (this.next == null) {
            System.out
                    .println("no next Handler, this request can not be handle~");
        } else {
            System.out.println("County: pass~");
            this.next.handleRequest(value);
        }
    }
}
