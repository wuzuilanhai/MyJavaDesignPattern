package com.biubiu.Decorator;

/**
 * @author 张海彪
 * @create 2017-10-03 下午2:26
 */
public abstract class PainterDecorator implements Painter {

    private Painter decoratedPainter;

    public PainterDecorator(Painter decoratedPainter) {
        this.decoratedPainter = decoratedPainter;
    }

    public Painter getPainter() {
        return this.decoratedPainter;
    }
}
