package com.biubiu.Memento;

/**
 * @author 张海彪
 * @create 2017-10-03 下午5:34
 */
public class Storage {
    private Memento memento;

    public Storage(Memento memento) {
        this.memento = memento;
    }

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
