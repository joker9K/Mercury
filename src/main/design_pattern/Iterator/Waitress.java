package main.design_pattern.Iterator;

import java.util.Iterator;

/**
 * @author supo
 * @Date 2017/2/7 22:20.
 * Copyright © mizhuanglicai
 * 迭代器与组合模式
 */
public class Waitress {

    PancakeHouseMenu pancakeHouseMenu;
    DinerMenu dinerMenu;

    public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    public void printMenu(){
        Iterator pancakeIterator = pancakeHouseMenu.createIterator();
        Iterator dinerIterator = dinerMenu.createIterator();
        System.out.println("MENU\n----\nBREAKFAST");
        printMenu(pancakeIterator);
        System.out.println("\nLUNCH");
        printMenu(dinerIterator);
    }

    private void printMenu(Iterator iterator){
        while (iterator.hasNext()){
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.print(menuItem.getName()+", ");
            System.out.print(menuItem.getPrice()+" -- ");
            System.out.println(menuItem.getDesc()+"");
        }
    }
}
