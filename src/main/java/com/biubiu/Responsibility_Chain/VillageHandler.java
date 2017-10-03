package com.biubiu.Responsibility_Chain;

/**
 * @author 张海彪
 * @create 2017-10-03 下午5:56
 */
public class VillageHandler extends Handler {
    @Override
    public void handleRequest(String value) {
        if ("village".equals(value)) {
            System.out.println("VillageHandler: handled~");
        } else {
            System.out.println("VillageHandler: pass~");
            this.next.handleRequest(value);
        }
    }
}
