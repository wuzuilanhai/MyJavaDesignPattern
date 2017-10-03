package com.biubiu.Command;

/**
 * @author 张海彪
 * @create 2017-10-03 下午6:02
 */
public class Invoker {
    public void execute(Command command) {
        command.execute();
    }
}
