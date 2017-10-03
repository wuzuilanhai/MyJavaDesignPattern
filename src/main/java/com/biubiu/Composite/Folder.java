package com.biubiu.Composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 张海彪
 * @create 2017-10-03 下午3:10
 */
public class Folder extends File {

    private List<File> fileList = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    @Override
    public void showFileName() {
        System.out.println(this.name);
    }

    public void addFile(File file) {
        fileList.add(file);
    }

    public void displayFiles() {
        fileList.forEach(file -> file.showFileName());
    }

}
