package main.think_in_java;

/**
 * Created by zhangwt on 2017/4/4.
 * 值比较和对象比较
 * 在 int自动装箱成Integer的过程中，如果数值是在-128~127之间的值的话，那么会在在内存中供重用
 */
public class Equivalence {

    public static void main(String[] args) {
        Integer n1 = new Integer(47);
        Integer n2 = new Integer(47);
        int n3 = 47;
        System.out.println(n1 == n2);//false
        System.out.println(n1 == n3);//true

        Integer m1 = 147;
        Integer m2 = 147;
        System.out.println(m1 == m2);//false

        Integer o1 = 47;
        Integer o2 = 47;
        System.out.println(o1 == o2);//true
    }
}
