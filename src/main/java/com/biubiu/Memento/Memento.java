package com.biubiu.Memento;

import lombok.Data;

/**
 * @author 张海彪
 * @create 2017-10-03 下午5:29
 */
@Data
public class Memento {
    private String state;
    private float x;
    private float y;

    public Memento(String state, float x, float y) {
        this.state = state;
        this.x = x;
        this.y = y;
    }
}
