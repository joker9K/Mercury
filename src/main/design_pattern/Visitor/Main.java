package main.design_pattern.Visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangwt
 * @date 2017/6/22 16:59.
 * 变量被声明时的类型叫做变量的静态类型(Static Type)，有些人又把静态类型叫做明显类型(Apparent Type)；而变量所引用的对象的真实类型又叫做变量的实际类型(Actual Type)。
 * 静态分派(Static Dispatch)发生在编译时期，分派根据静态类型信息发生。静态分派对于我们来说并不陌生，方法重载就是静态分派。
 * 动态分派(Dynamic Dispatch)发生在运行时期，动态分派动态地置换掉某个方法。
 */
public class Main {

    public static void main(String[] args) {
        Visitor v1 = new ConcreteVisitorB();
        List<Visitable> list = new ArrayList<>();
        list.add(new ConcreteElementA());
        list.add(new ConcreteElementB());

        for(Visitable able :list){
            able.accept(v1);
        }

    }
}
