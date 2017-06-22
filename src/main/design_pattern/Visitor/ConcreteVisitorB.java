package main.design_pattern.Visitor;

/**
 * @author zhangwt
 * @date 2017/6/22 16:56.
 */
public class ConcreteVisitorB implements Visitor{

    @Override
    public void visit(ConcreteElementB able) {
        able.operate();
    }

    @Override
    public void visit(ConcreteElementA able) {
        able.operate();
    }
}
