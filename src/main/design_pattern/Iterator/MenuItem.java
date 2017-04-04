package main.design_pattern.Iterator;

/**
 * @author supo
 * @Date 2017/2/7 21:30.
 * Copyright © mizhuanglicai
 */
public class MenuItem {

    private String name;
    private String desc;
    private boolean vegetarian;
    private double price;

    public MenuItem(String name, String desc, boolean vegetarian, double price) {
        this.name = name;
        this.desc = desc;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
