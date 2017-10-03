package com.biubiu.Facade;

/**
 * @author 张海彪
 * @create 2017-10-03 下午3:22
 */
public class ComputerFacade {
    private Bios bios;
    private Disk disk;
    private OS os;

    public ComputerFacade() {
        bios = new Bios();
        disk = new Disk();
        os = new OS();
    }

    public void start() {
        bios.start();
        disk.load();
        os.start(disk);
    }
}
