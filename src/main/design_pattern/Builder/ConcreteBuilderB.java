package main.design_pattern.Builder;

/**
 * Created by Administrator on 2016/11/28.
 */
public class ConcreteBuilderB implements Builder{

    private Product product = new Product();


    /**
     * 产品零件建造方法1
     */
    @Override
    public void buildPart1() {
        product.setPart1("编号：9333");
    }

    /**
     * 产品零件建造方法2
     */
    @Override
    public void buildPart2() {
        product.setPart2("名称：YYY");
    }

    /**
     * 产品返还方法
     * @return
     */
    @Override
    public Product retrieveResult() {
        return product;
    }
}
