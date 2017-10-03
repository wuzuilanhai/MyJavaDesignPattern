package com.biubiu.Builder;

/**
 * @author 张海彪
 * @create 2017-10-03 下午1:38
 **/
public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public Computer construct() {
        this.builder.createComputer();
        this.builder.buildCpu();
        this.builder.buildRam();
        this.builder.buildMonitor();
        return this.builder.getComputer();
    }

    public Builder getBuilder() {
        return builder;
    }

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }
}
