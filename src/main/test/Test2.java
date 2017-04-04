package main.test;

/**
 * @author supo
 * @Date 2017/3/31 23:40.
 * Copyright © mizhuanglicai
 */
class GrandFather{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void test(){
        System.out.println("grandfather");
    }
}


class Father extends GrandFather{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void test(){
        System.out.println("father");
    }
}
class Son extends Father{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void test(){
        super.test();
    }
}
public class Test2 {
    public static void main(String[] args) {
        GrandFather son = new Son();
        son.test();
    }
}
