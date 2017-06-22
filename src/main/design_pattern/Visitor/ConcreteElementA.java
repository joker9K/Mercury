package main.design_pattern.Visitor;

/**
 * @author zhangwt
 * @date 2017/6/22 16:57.
 */
public class ConcreteElementA implements Visitable{

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    @Override
    public void operate(){
        System.out.println("ConcreteElementA ....");
    }
}
