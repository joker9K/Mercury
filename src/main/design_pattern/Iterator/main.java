package main.design_pattern.Iterator;

/**
 * @author supo
 * @Date 2017/2/7 22:19.
 * Copyright © mizhuanglicai
 */
public class main {

    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
        Waitress waitress = new Waitress(pancakeHouseMenu,dinerMenu);
        waitress.printMenu();
    }
}
