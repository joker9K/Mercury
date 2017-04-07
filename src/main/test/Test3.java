package main.test;

/**
 * Created by zhangwt on 2017/4/4.
 */
class Shape{
    static int i=47;
}
class Increase{
    public void increase(){
        Shape.i++;
    }
}

public class Test3 {

    public static void main(String[] args) {
        Shape a = new Shape();
        Shape b = new Shape();
        Increase increase = new Increase();
        increase.increase();
        System.out.println(b.i);

        System.getProperties().list(System.out);
    }
}
