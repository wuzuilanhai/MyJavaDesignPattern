package com.biubiu.Builder;

/**
 * @author 张海彪
 * @create 2017-10-03 下午1:37
 **/
public class LenoveBuilder extends Builder {
    @Override
    public void buildCpu() {
        System.out.println("lenovo: build cpu start...");
        this.getComputer().setCpu("lenovo cpu");
        System.out.println("lenovo: build cpu end...");
    }

    @Override
    public void buildRam() {
        System.out.println("lenovo: build ram start...");
        this.getComputer().setRam("lenovo ram");
        System.out.println("lenovo: build ram end...");
    }

    @Override
    public void buildMonitor() {
        System.out.println("lenovo: build monitor start...");
        this.getComputer().setMonitor("lenovo monitor");
        System.out.println("lenovo: build monitor end...");
    }
}
