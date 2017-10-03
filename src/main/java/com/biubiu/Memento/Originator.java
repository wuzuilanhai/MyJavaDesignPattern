package com.biubiu.Memento;

import lombok.Data;

/**
 * @author 张海彪
 * @create 2017-10-03 下午5:30
 */
@Data
public class Originator {
    private String state;
    private float x;
    private float y;

    public Memento saveMemento() {
        return new Memento(state, x, y);
    }

    public void restoreFromMemento(Memento memento) {
        this.state = memento.getState();
        this.x = memento.getX();
        this.y = memento.getY();
    }
}
