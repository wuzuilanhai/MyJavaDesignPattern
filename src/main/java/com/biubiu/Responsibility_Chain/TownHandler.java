package com.biubiu.Responsibility_Chain;

/**
 * @author 张海彪
 * @create 2017-10-03 下午5:56
 */
public class TownHandler extends Handler {
    @Override
    public void handleRequest(String value) {
        if ("town".equals(value)) {
            System.out.println("VillageHandler: handled~");
        } else {
            System.out.println("Town: pass~");
            this.next.handleRequest(value);
        }
    }
}
