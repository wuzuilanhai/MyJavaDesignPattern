package com.biubiu.Decorator;

/**
 * @author 张海彪
 * @create 2017-10-03 下午2:31
 **/
public class TreePainterDecorator extends PainterDecorator {
    public TreePainterDecorator(Painter paper) {
        super(paper);
    }

    @Override
    public String getDescription() {
        return this.getPainter().getDescription() + "can paint tree, ";
    }

    @Override
    public String painting() {
        /* painting the tree */
        return this.getPainter().painting() + paintingTree();
    }

    public String paintingTree() {
        return "Tree, ";
    }

}
