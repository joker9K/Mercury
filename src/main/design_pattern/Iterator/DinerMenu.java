package main.design_pattern.Iterator;

import java.util.Iterator;

/**
 * @author supo
 * @Date 2017/2/7 21:38.
 * Copyright © mizhuanglicai
 */
public class DinerMenu {
    static final int MAX_TIMES =6;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_TIMES];
        addItem("Vegetarian BLT","(Fakin') Bacon with lettuce & tomato on whole wheat",true,2.99);
        addItem("BLT","Bacon with lettuce & tomato on whole wheat",false,2.99);
        addItem("Soup of the day","Soup of the day,with a side of potato salad",false,3.29);
        addItem("Hotdog","A hot dog,with saurkraut,relish,onions,topped with cheese",false,3.05);
    }

    public void addItem(String name,String desc,boolean vegetarian,double price){
        MenuItem menuItem = new MenuItem(name,desc,vegetarian,price);
        if(numberOfItems >= MAX_TIMES){
            System.err.println("Sorry,menu is full! Can't additem to menu");
        }else {
            menuItems[numberOfItems]=menuItem;
            numberOfItems++;
        }
    }

    public Iterator createIterator(){
        return new DinerMenuIterator(menuItems);
    }
}