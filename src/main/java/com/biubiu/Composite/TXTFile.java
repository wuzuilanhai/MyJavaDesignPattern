package com.biubiu.Composite;

/**
 * @author 张海彪
 * @create 2017-10-03 下午3:15
 */
public class TXTFile extends File {

    public TXTFile(String name) {
        this.name = name;
    }

    @Override
    public void showFileName() {
        System.out.println(this.name);
    }
}
