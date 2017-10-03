package com.biubiu.Responsibility_Chain;

/**
 * @author 张海彪
 * @create 2017-10-03 下午5:57
 */
public class Main {
    public static void main(String[] args) {
        Handler villageHandler = new VillageHandler();
        Handler townHandler = new TownHandler();
        Handler countyHandler = new CountyHandler();

        villageHandler.setNext(townHandler);
        townHandler.setNext(countyHandler);

        System.out.println("test county request:");
        villageHandler.handleRequest("county");

        System.out.println("\ntest city request:");
        villageHandler.handleRequest("city");
    }
}
