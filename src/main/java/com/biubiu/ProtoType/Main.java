package com.biubiu.ProtoType;

/**
 * @author 张海彪
 * @create 2017-10-02 下午9:15
 **/
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Cell cell = new Cell(888);
        for (int i = 0; i < 10; i++) {
            Cell copyCell = (Cell) cell.clone();
            System.out.println(copyCell.hashCode() + ":" + cell.getCellId());
        }
    }
}
