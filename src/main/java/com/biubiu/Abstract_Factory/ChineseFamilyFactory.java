package com.biubiu.Abstract_Factory;

/**
 * @author 张海彪
 * @create 2017-10-03 下午4:40
 */
public class ChineseFamilyFactory implements IFamilyFactory {
    public IFather createFather(String name) {
        return new ChineseFather(name);
    }

    public IMother createMother(String name) {
        return new ChineseMother(name);
    }
}
