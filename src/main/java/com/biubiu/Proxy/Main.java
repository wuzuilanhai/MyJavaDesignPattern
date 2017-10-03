package com.biubiu.Proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;

/**
 *
 * @author 张海彪
 * @create 2017-10-03 下午3:31
 */
public class Main {
    public static void main(String[] args) {
        //静态代理
        Server staticProxyServer = new StaticProxyServer();
        System.out.println(staticProxyServer.response());

        //动态代理
        DynamicProxyServerHandler dpshandler = new DynamicProxyServerHandler(new ApplicationServer());
        Server dynamicProxyServer = (Server) dpshandler.getProxyServer();
        System.out.println(dynamicProxyServer.response());

        //cglib代理
        MethodInterceptor methodInterceptor = new CglibProxyServerInterceptor();
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(ApplicationServer.class);
        enhancer.setCallback(methodInterceptor);
        Server server = (Server) enhancer.create();
        System.out.println(server.response());
    }
}
