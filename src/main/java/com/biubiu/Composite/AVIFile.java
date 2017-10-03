package com.biubiu.Composite;

/**
 * @author 张海彪
 * @create 2017-10-03 下午3:16
 */
public class AVIFile extends File {
    public AVIFile(String name) {
        this.name = name;
    }

    @Override
    public void showFileName() {
        System.out.println(this.name);
    }
}
