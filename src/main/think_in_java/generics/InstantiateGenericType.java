package main.think_in_java.generics;

/**
 * Created by zhangwt on 2017/4/7.
 * 解决new T()的替代方法,但必须保证T有默认的午餐构造器
 */
class ClassAsFactory<T>{
    T x;
    public ClassAsFactory(Class<T> kind){
        try {
            x = kind.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new RuntimeException();
        }
    }
}
class Employee{
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
//编译会成功
public class InstantiateGenericType {
    public static void main(String[] args) {
        ClassAsFactory<Employee> fe = new ClassAsFactory<>(Employee.class);
        Employee employee = fe.x;
        employee.setAge(12);
        System.out.println(employee.getAge());
        System.out.println("ClassAsFactory<Employee> succeeded");

        //此处运行会失败,因为Integer没有默认构造器
        try {
            ClassAsFactory<Integer> fi = new ClassAsFactory<>(Integer.class);
        } catch (Exception e) {
            System.out.println("ClassAsFactory<Employee> failed");
        }
    }
}
