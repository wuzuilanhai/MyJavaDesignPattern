package com.biubiu.Abstract_Factory;

/**
 * @author 张海彪
 * @create 2017-10-03 下午4:39
 */
public class AmericanFamilyFactory implements IFamilyFactory {
    public AmericanFamilyFactory() {
    }

    public IFather createFather(String name) {
        return new AmericanFather(name);
    }

    public IMother createMother(String name) {
        return new AmericanMother(name);
    }
}
