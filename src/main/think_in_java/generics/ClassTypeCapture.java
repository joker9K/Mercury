package main.think_in_java.generics;

/**
 * Created by zhangwt on 2017/4/7.
 * 引入类型标签来对擦除进行补偿,使用动态的isInstance()
 */
class Building{}
class Houses extends Building{}
public class ClassTypeCapture<T> {
    Class<T> kind;

    public ClassTypeCapture(Class<T> kind) {
        this.kind = kind;
    }

    public boolean f(Object arg){
        return kind.isInstance(arg);
    }

    public static void main(String[] args) {
        ClassTypeCapture<Building> ctt1 = new ClassTypeCapture<>(Building.class);
        System.out.println(ctt1.f(new Building()));
        System.out.println(ctt1.f(new Houses()));

        ClassTypeCapture<Houses> ctt2 = new ClassTypeCapture<>(Houses.class);
        System.out.println(ctt2.f(new Building()));
        System.out.println(ctt2.f(new Houses()));

    }
}
