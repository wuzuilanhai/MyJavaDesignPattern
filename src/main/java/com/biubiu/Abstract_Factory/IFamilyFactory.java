package com.biubiu.Abstract_Factory;

/**
 * @author 张海彪
 * @create 2017-10-03 下午4:40
 */
public interface IFamilyFactory {
    IFather createFather(String name);

    IMother createMother(String name);
}
