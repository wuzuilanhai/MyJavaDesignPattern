package com.biubiu.Adapter;

/**
 * @author 张海彪
 * @create 2017-10-03 下午4:25
 */
public class Main {
    public static void main(String[] args) {
        IUSB usb = new HPUSB();
        usb.charge();

        IUSB usb_psp = new PSPAdapter1();//继承(类的适配器)
        usb_psp.charge();

        IUSB usb_psp2 = new PSPAdapter2(new PSP());//组合（对象的适配器）
        usb_psp2.charge();
    }
}
