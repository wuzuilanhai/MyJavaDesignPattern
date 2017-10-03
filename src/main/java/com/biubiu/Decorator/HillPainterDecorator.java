package com.biubiu.Decorator;

/**
 * @author 张海彪
 * @create 2017-10-03 下午2:28
 **/
public class HillPainterDecorator extends PainterDecorator {

    public HillPainterDecorator(Painter decoratedPainter) {
        super(decoratedPainter);
    }

    @Override
    public String getDescription() {
        return this.getPainter().getDescription() + "can paint hill, ";
    }

    @Override
    public String painting() {
        return this.getPainter().painting() + paintingHill();
    }

    public String paintingHill() {
        return "Hill, ";
    }
}
