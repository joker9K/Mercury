package main.think_in_java.generics;

/**
 * Created by zhangwt on 2017/4/8.
 * 类型推断
 * 如果向一个使用<?>的方法传递原生类型,那么对编译器来说,可能会推断出实际的类型参数,使得这个方法可以回转并调用另一个使用这个确切类型的方法
 */
public class CaptureConversion {
    static <T> void f1(Holder<T> holder){
        T t = holder.get();
        System.out.println(t.getClass().getSimpleName());
    }
    static void f2(Holder<?> holder){
        f1(holder);
    }

    public static void main(String[] args) {
        Holder raw = new Holder<Integer>(1);
        f1(raw);//Produces warnings
        f2(raw);//No warnings
        Holder rawBasic = new Holder();
        rawBasic.set(new Object());
        f2(rawBasic);

        Holder<?> wildcarded = new Holder<Double>(1.0);
        f2(wildcarded);
    }
}
