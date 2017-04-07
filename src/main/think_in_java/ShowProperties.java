package main.think_in_java;

import java.util.Map;

/**
 * Created by zhangwt on 2017/4/4.
 */
public class ShowProperties {
    public static void main(String[] args) {
        System.getProperties().list(System.out);//从运行程序的系统中获取所有属性
        System.out.println(System.getProperty("user.name"));//获得user.name的属性
        System.out.println(System.getProperty("user.dir"));

        for(Map.Entry entry : System.getenv().entrySet()){//显示所有操作系统环境变量
            System.out.println(entry.getKey()+": "+entry.getValue());
        }
    }
}
