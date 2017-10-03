package com.biubiu.Memento;

/**
 * @author 张海彪
 * @create 2017-10-03 下午5:35
 */
public class Main {
    public static void main(String[] args) {
        Originator originator = new Originator();
        originator.setState("2017-01-01");
        originator.setX(1.4f);
        originator.setY(5.4f);
        Storage storage = new Storage(originator.saveMemento());
        System.out.println("初始化状态为：" + originator);
        originator.setState("2017-11-11");
        System.out.println("修改后的状态为：" + originator);
        originator.restoreFromMemento(storage.getMemento());
        System.out.println("恢复后的状态为：" + originator);
    }
}
