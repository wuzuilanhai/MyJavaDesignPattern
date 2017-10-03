package com.biubiu.Factory_Method;

/**
 * @author 张海彪
 * @create 2017-10-03 下午1:48
 **/
public class ChineseFatherFactory implements IFatherFactory {
    @Override
    public Father createFather(String name) {
        return new ChineseFather(name);
    }
}
