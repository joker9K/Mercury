package main.design_pattern.Observer;

/**
 * Created by supo on 2016/11/28.
 */
abstract  class Observer {
    protected  String name;
    protected Subject sub;

    public Observer(String name,Subject sub){
        this.name = name;
        this.sub = sub;
    }

    public abstract void update();
}
