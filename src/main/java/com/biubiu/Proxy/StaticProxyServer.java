package com.biubiu.Proxy;

/**
 * @author 张海彪
 * @create 2017-10-03 下午3:26
 */
public class StaticProxyServer implements Server {

    private ApplicationServer applicationServer = new ApplicationServer();

    @Override
    public String response() {
        String str = applicationServer.response() + "(by ProxyServer, static proxy.)";
        return str;
    }
}
