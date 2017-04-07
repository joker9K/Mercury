package main.think_in_java;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

/**
 * Created by zhangwt on 2017/4/6.
 * 队列
 */
public class QueueDemo {

    public static  void printQ(Queue queue){
        while (queue.peek() != null){
            System.out.print(queue.remove()+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        Random rand = new Random(47);
        for(int i=0;i<10;i++){
            queue.offer(rand.nextInt(i+10));//offer()方法是与Queue相关的方法之一,它在允许的情况下,将一个元素插入到队尾
        }
        printQ(queue);
        Queue<Character> qc = new LinkedList<>();
        for(char c : "Brontosaurus".toCharArray()){
            qc.offer(c);
        }
        printQ(qc);
    }
}
