package com.biubiu.Adapter;

/**
 * @author 张海彪
 * @create 2017-10-03 下午4:24
 */
public class PSPAdapter1 extends PSP implements IUSB {
    @Override
    public void charge() {
        super.pspCharge();
    }
}
