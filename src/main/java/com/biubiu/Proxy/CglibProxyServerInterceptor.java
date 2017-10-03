package com.biubiu.Proxy;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * JDK动态代理要求被代理对象实现接口，cglib要求被代理对象未被final修饰
 * 通过ASM创建字节码
 *
 * @author 张海彪
 * @create 2017-10-03 下午3:40
 */
public class CglibProxyServerInterceptor implements MethodInterceptor {
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        Object result = methodProxy.invokeSuper(o, objects);
        String str = result.toString() + "(by ProxyServer, cglib proxy.)";
        return str;
    }
}
