package main.design_pattern.Proxy;

/**
 * @author supo
 * @Date 2016/11/14 21:12.
 * Copyright © mizhuanglicai
 */
public class Pursuit implements GiveGift{

    main.design_pattern.Proxy.SchoolGirl mm;

    public Pursuit(main.design_pattern.Proxy.SchoolGirl mm){
        this.mm = mm;
    }

    @Override
    public void giveDolls() {
        System.out.println(mm.getName()+" 送你洋娃娃");
    }

    @Override
    public void giveFlowers() {
        System.out.println(mm.getName()+" 送你鲜花");
    }

    @Override
    public void giveChocolate() {
        System.out.println(mm.getName()+" 送你巧克力");
    }
}
