package com.biubiu.ProtoType;

import java.io.*;

/**
 * @author 张海彪
 * @create 2017-10-02 下午9:13
 **/
public class Cell implements Cloneable {
    private int cellId;

    public int getCellId() {
        return cellId;
    }

    public void setCellId(int cellId) {
        this.cellId = cellId;
    }

    public Cell(int cellId) {
        this.cellId = cellId;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        System.out.println("clone a cell obj.");
        return super.clone();
    }

    /**
     * 深克隆
     *
     * @return
     * @throws IOException
     * @throws ClassNotFoundException
     */
    protected Object deepClone() throws IOException, ClassNotFoundException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(this);

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        return ois.readObject();
    }
}
