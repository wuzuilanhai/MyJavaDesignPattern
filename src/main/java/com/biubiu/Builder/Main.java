package com.biubiu.Builder;

/**
 * @author 张海彪
 * @create 2017-10-03 下午1:40
 **/
public class Main {
    public static void main(String[] args) {
        Builder hpBuilder = new HPBuilder();
        Director director = new Director(hpBuilder);
        Computer hpPc = director.construct();
        System.out.println(hpPc);

        Builder lenoveBuilder = new LenoveBuilder();
        director.setBuilder(lenoveBuilder);
        Computer lenovoPc = director.construct();
        System.out.println(lenovoPc);
    }
}
