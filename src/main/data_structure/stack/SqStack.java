package main.data_structure.stack;

/**
 * @author supo
 * @Date 2017/3/28 14:23.
 * Copyright © mizhuanglicai
 */
public class SqStack<T> implements IStack<T> {
    private T[] stackElem;
    private int top;

    public SqStack() {
        this(10);//默认栈大小为10
    }

    @SuppressWarnings("unchecked")
    public SqStack(int maxSize) {
        top = 0;
        stackElem = (T[]) new Object[maxSize];
    }

    @Override
    public void clear() {
        for (T t : stackElem) {
            t = null;
        }
        top = 0;
    }

    @Override
    public boolean isEmpty() {
        return top == 0;
    }

    @Override
    public int length() {
        return top;
    }

    @Override
    public T peek() {
        if(isEmpty()){
            throw null;
        }
        return stackElem[top-1];
    }

    @Override
    public void push(T x) throws Exception {
        if(top == stackElem.length){
            throw new Exception("栈已满");
        }
        stackElem[top++] = x;
    }

    @Override
    public T pop() {
        if(isEmpty()){
            return null;
        }
        return stackElem[--top];
    }

    @Override
    public void display() {
        for(T t : stackElem){
            System.out.println(t+" ");
        }
    }

    public static void main(String[] args) throws Exception {
        SqStack<Integer> stack = new SqStack<>();
        stack.push(2);
        stack.display();
        stack.pop();
        stack.display();
    }
}
