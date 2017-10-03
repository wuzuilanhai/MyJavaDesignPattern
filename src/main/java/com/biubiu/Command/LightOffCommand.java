package com.biubiu.Command;

/**
 * @author 张海彪
 * @create 2017-10-03 下午6:01
 */
public class LightOffCommand implements Command {
    private Receiver receiver;

    public LightOffCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        this.receiver.turnOFF();
    }
}
