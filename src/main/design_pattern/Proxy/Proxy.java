package main.design_pattern.Proxy;

/**
 * @author supo
 * @Date 2016/11/14 21:20.
 * Copyright © mizhuanglicai
 */
public class Proxy implements GiveGift{

    Pursuit gg;
    public Proxy(SchoolGirl mm){
        gg = new Pursuit(mm);
    }

    @Override
    public void giveDolls() {
        gg.giveDolls();
    }

    @Override
    public void giveFlowers() {
        gg.giveFlowers();
    }

    @Override
    public void giveChocolate() {
        gg.giveChocolate();
    }
}
