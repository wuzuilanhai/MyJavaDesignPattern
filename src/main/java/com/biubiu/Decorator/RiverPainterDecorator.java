package com.biubiu.Decorator;

/**
 * @author 张海彪
 * @create 2017-10-03 下午2:28
 **/
public class RiverPainterDecorator extends PainterDecorator {

    public RiverPainterDecorator(Painter decoratedPainter) {
        super(decoratedPainter);
    }

    @Override
    public String getDescription() {
        return this.getPainter().getDescription() + "can paint river, ";
    }

    @Override
    public String painting() {
        return this.getPainter().painting() + paintingRiver();
    }

    public String paintingRiver() {
        return "River, ";
    }
}
