package com.biubiu.Adapter;

/**
 * @author 张海彪
 * @create 2017-10-03 下午4:22
 */
public class HPUSB implements IUSB {
    @Override
    public void charge() {
        System.out.println("使用惠普USB接口充电~");
    }
}
