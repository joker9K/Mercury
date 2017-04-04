package main.design_pattern.Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author supo
 * @Date 2017/2/7 21:27.
 * Copyright © mizhuanglicai
 */
public class PancakeHouseMenu {
    List<MenuItem> menuItems;

    public PancakeHouseMenu(){
        menuItems = new ArrayList<MenuItem>();
        addItem("K&B's Pancake Breakfast","Pancake with scrambled eggs, and toast",true,2.99);
        addItem("Regular Pancake Breakfast","Pancake with fried eggs,sausage",false,2.99);
        addItem("Blueberry made with fresh blueberries","Pancake made with fresh blueberries",true,3.49);
        addItem("Waffles","Waffles,with your choice of blueberries or strawberries",true,3.59);
    }

    public void addItem(String name,String desc,boolean vegetarian,double price){
        MenuItem menuItem = new MenuItem(name,desc,vegetarian,price);
        menuItems.add(menuItem);
    }

    public List<MenuItem> getMenuItems() {
        return menuItems;
    }

    public Iterator createIterator(){
        return new PancakeHouseMenuIterator(menuItems);
    }
}
