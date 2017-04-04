package main.data_structure.stack;

/**
 * @author supo
 * @Date 2017/3/28 14:21.
 * Copyright © mizhuanglicai
 */
public interface IStack<T> {
    void clear();
    boolean isEmpty();
    int length();
    T peek();
    void push(T x)throws Exception;
    T pop();
    void display();
}
