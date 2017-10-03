package com.biubiu.Proxy;

/**
 * @author 张海彪
 * @create 2017-10-03 下午3:25
 */
public class ApplicationServer implements Server {
    @Override
    public String response() {
        return "response from ApplicationServers";
    }
}
