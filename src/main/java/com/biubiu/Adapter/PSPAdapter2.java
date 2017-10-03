package com.biubiu.Adapter;

/**
 * @author 张海彪
 * @create 2017-10-03 下午4:24
 */
public class PSPAdapter2 implements IUSB {

    private PSP psp;

    public PSPAdapter2(PSP psp) {
        this.psp = psp;
    }

    @Override
    public void charge() {
        psp.pspCharge();
    }
}
