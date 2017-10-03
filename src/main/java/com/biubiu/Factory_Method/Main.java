package com.biubiu.Factory_Method;

/**
 * @author 张海彪
 * @create 2017-10-03 下午1:50
 **/
public class Main {
    public static void main(String[] args) {
        IFatherFactory factory = new ChineseFatherFactory();
        Father cnfather = factory.createFather("cn father");
        cnfather.printName();

        IFatherFactory usff = new AmericanFatherFactory();
        Father usFather = usff.createFather("us father");
        usFather.printName();
    }
}
