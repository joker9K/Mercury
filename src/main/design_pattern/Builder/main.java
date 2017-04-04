package main.design_pattern.Builder;

/**
 * 建造者模式
 * Created by supo on 2016/11/28.
 */
public class main {

    public static void main(String[] args) {
        //A建造者
        Builder builderA = new ConcreteBuilderA();
        Director director = new Director(builderA);
        director.construct();
        Product product = builderA.retrieveResult();
        System.out.println(product.getPart1());
        System.out.println(product.getPart2());

        //B建造者
        Builder builderB = new ConcreteBuilderB();
        director = new Director(builderB);
        director.construct();
        product = builderB.retrieveResult();
        System.out.println(product.getPart1());
        System.out.println(product.getPart2());
    }
}
