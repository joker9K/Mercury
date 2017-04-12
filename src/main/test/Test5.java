package main.test;

/**
 * Created by zhangwt on 2017/4/12.
 * 类初始化的顺序
 *
 */
public class Test5 {

    static Test5 test = new Test5();

    static {
        System.out.println("static");
    }

    {
        System.out.println("normal");
    }

    public static void main(String[] args) {
        Test5 test = new Test5();
    }

}

//上述代码等同于以下代码,先进行静态变量初始化,调用非静态代码块,然后静态代码块再调用
/*
public class Test5 {

    static Test5 test = new Test5();

    public Test5(){
        System.out.println("normal");
    }

    static {
        System.out.println("static");
    }

    public static void main(String[] args) {
        Test5 test = new Test5();
    }

}*/
