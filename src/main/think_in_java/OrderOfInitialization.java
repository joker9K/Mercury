package main.think_in_java;

/**
 * Created by zhangwt on 2017/4/5.
 * 在类的内部,变量定义的先后顺序决定了初始化的顺序.即使变量定义散布于方法
 * 定义之间,它们仍旧会在任何方法(包括构造器)被调用之前得到初始化.
 */

class Window{
    Window(int marker){
        System.out.println("Window("+marker+")");
    }
}
class House{
    Window w1 = new Window(1);
    House(){
        System.out.println("House()");
        w3 = new Window(33);
    }
    Window w2 = new Window(2);
    void f(){
        System.out.println("f()");
    }
    Window w3 = new Window(3);
}
public class OrderOfInitialization {
    public static void main(String[] args) {
        House h = new House();
        h.f();
    }
}
