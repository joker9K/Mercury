package main.design_pattern.Visitor;

/**
 * @author zhangwt
 * @date 2017/6/22 16:54.
 */
public interface Visitor {

    void visit(ConcreteElementB able);
    void visit(ConcreteElementA able);
}
