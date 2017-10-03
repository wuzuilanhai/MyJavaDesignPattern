package com.biubiu.Decorator;

/**
 * @author 张海彪
 * @create 2017-10-03 下午2:32
 **/
public class Main {
    public static void main(String[] args) {
        Painter p0 = new PaintBeginner();
        System.out.println("Painter description:" + p0.getDescription());
        System.out.println("Painting:" + p0.painting() + "\n");

        HillPainterDecorator p2 = new HillPainterDecorator(new PaintBeginner());
        System.out.println("Painter description:" + p2.getDescription());
        System.out.println("Painting:" + p2.painting());
        System.out.println("Painting:" + p2.paintingHill() + "\n"); //新增的行为

        RiverPainterDecorator p3 = new RiverPainterDecorator(new PaintBeginner());
        System.out.println("Painter description:" + p3.getDescription());
        System.out.println("Painting:" + p3.painting());
        System.out.println("Painting:" + p3.paintingRiver() + "\n"); //新增的行为

        HillPainterDecorator p4 = new HillPainterDecorator(new RiverPainterDecorator(new TreePainterDecorator(new PaintBeginner())));
        System.out.println("Painter description:" + p4.getDescription());
        System.out.println("Painting:" + p4.painting());
        System.out.println("Painting:" + p4.paintingHill() + "\n"); //新增的行为
    }
}
