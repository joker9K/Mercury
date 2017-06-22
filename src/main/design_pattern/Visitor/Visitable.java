package main.design_pattern.Visitor;

/**
 * @author zhangwt
 * @date 2017/6/22 16:55.
 */
public interface Visitable {

    void accept(Visitor v);
    void operate();
}
