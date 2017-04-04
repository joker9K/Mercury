package main.design_pattern.Proxy;

/**
 * 代理模式
 * @author supo
 * @Date 2016/11/14 21:18.
 * Copyright © mizhuanglicai
 */
public class Main {
    public static void main(String[] args){
        main.design_pattern.Proxy.SchoolGirl jiaojiao = new main.design_pattern.Proxy.SchoolGirl();
        jiaojiao.setName("李娇娇");
        Proxy proxy = new Proxy(jiaojiao);
        proxy.giveDolls();
        proxy.giveChocolate();
        proxy.giveFlowers();
    }

}
