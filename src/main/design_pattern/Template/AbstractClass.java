package main.design_pattern.Template;

/**
 * 模板方法模式
 * Created by supo on 2016/11/23.
 */
abstract class AbstractClass {
    public abstract void primitiveOperation1();

    public abstract void primitiveOperation2();


    public void templateMethod(){
        primitiveOperation1();
        primitiveOperation2();
        System.out.println("");
    }
}
