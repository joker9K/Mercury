package main.design_pattern.Observer;

import java.util.Observer;

/**
 * Created by Administrator on 2016/11/28.
 */
public interface Subject {

    void attach(Observer observer);
    void detach(Observer observer);
    void Notify();
}
