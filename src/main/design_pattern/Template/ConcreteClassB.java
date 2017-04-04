package main.design_pattern.Template;

/**
 *
 * 模板方法模式
 * Created by Administrator on 2016/11/23.
 */
public class ConcreteClassB extends AbstractClass{

    @Override
    public void primitiveOperation1() {
        System.out.println("具体累B方法1实现");
    }

    @Override
    public void primitiveOperation2() {
        System.out.println("具体类C方法2实现");
    }
}
