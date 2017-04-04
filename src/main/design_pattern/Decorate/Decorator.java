package main.design_pattern.Decorate;

/**
 * 装饰器模式
 * @author supo
 * @Date 2016/11/9 21:02.
 * Copyright © mizhuanglicai
 */
abstract class Decorator extends  Component {
    protected Component component;

    public void setComponent(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        if(component!=null){
            component.operation();
        }
    }
}
