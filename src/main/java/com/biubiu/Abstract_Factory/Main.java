package com.biubiu.Abstract_Factory;

/**
 * @author 张海彪
 * @create 2017-10-03 下午4:41
 */
public class Main {
    public static void main(String[] args) {
        IFamilyFactory cnFamilyFactory = new ChineseFamilyFactory();
        IFamilyFactory usFamilyFactory = new AmericanFamilyFactory();
        IFather cnFather = cnFamilyFactory.createFather("cn father-test");
        IMother cnMother = cnFamilyFactory.createMother("cn mother-test");
        IFather usFather = usFamilyFactory.createFather("us father-test");
        IMother usMother = usFamilyFactory.createMother("us mother-test");
        cnFather.printName();
        cnMother.printName();
        usFather.printName();
        usMother.printName();
    }
}
