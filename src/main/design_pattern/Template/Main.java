package main.design_pattern.Template;

/**
 * Created by Administrator on 2016/11/23.
 */
public class Main {

    public static void main(String[] args) {
        AbstractClass c;
        c= new ConcreteClassA();
        c.templateMethod();

        c = new ConcreteClassB();
        c.templateMethod();

    }
}
