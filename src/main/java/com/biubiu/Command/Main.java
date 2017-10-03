package com.biubiu.Command;

/**
 * @author 张海彪
 * @create 2017-10-03 下午6:03
 */
public class Main {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Invoker invoker = new Invoker();
        Command turnOnLight = new LightOnCommand(receiver);
        Command turnOffLight = new LightOffCommand(receiver);

        invoker.execute(turnOnLight);
        invoker.execute(turnOffLight);
    }
}
