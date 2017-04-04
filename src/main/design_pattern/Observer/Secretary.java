package main.design_pattern.Observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

/**
 * Created by Administrator on 2016/11/28.
 */
public class Secretary implements Subject{

    private List<Observer> observers = new ArrayList<>();
    private String action;


    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void Notify() {
        //observers.forEach(o->o.update());
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }
}
