package com.biubiu.Builder;

/**
 * @author 张海彪
 * @create 2017-10-03 下午1:35
 **/
public abstract class Builder {
    private Computer pc;

    public abstract void buildCpu();

    public abstract void buildRam();

    public abstract void buildMonitor();

    public void createComputer() {
        this.pc = new Computer();
    }

    public Computer getComputer() {
        return this.pc;
    }
}
