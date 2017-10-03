package com.biubiu.Flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 张海彪
 * @create 2017-10-03 下午2:53
 */
public class FlyweightFactory {
    private Map<String, Object> strMap = new HashMap<>();

    public IFlyweight getInstance(String str) {
        IFlyweight fly = (IFlyweight) strMap.get(str);
        if (fly == null) {
            fly = new ShareStr(str);
            strMap.put(str, fly);
        }
        return fly;
    }
}
