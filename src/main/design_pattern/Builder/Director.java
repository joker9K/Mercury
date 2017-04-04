package main.design_pattern.Builder;

/**
 * 导演者类Director
 * Created by supo on 2016/11/28.
 */
public class Director {

    /**
     * 持有当前需要使用的建造器对象
     */
    private Builder builder;

    /**
     * 构造方法，传入建造器对象、
     * @param builder
     */
    public Director (Builder builder){
        this.builder = builder;
    }

    public void construct(){
        builder.buildPart1();
        builder.buildPart2();
    }
}
