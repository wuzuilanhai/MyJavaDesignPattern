package com.biubiu.Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * JDK动态代理要求被代理对象实现接口，cglib要求被代理对象未被final修饰
 * 通过JVM实现代理类字节码的创建
 *
 * @author 张海彪
 * @create 2017-10-03 下午3:29
 */
public class DynamicProxyServerHandler implements InvocationHandler {

    private Server appServer;

    public DynamicProxyServerHandler(Server appServer) {
        this.appServer = appServer;
    }

    public Object getProxyServer() {
        return Proxy.newProxyInstance(appServer.getClass().getClassLoader(), appServer.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object str = method.invoke(appServer, args);
        return str.toString() + "(by ProxyServer, dynamic proxy.)";
    }
}
