package main.concurrent;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Semaphore;

/**
 * 基于信号量实现某种资源池，基于信号量可以实现数据库连接池
 * @author supo
 * @Date 2017/3/22 23:56.
 * Copyright © mizhuanglicai
 */
public class BoundedHashSet<T> {
    private final Set<T> set;
    private final Semaphore sem;
    public BoundedHashSet(int bound){
        this.set = Collections.synchronizedSet(new HashSet<T>());
        sem = new Semaphore(bound);
    }
    public boolean add(T o) throws InterruptedException{
        sem.acquire();
        boolean wasAdded = false;
        try {
            wasAdded = set.add(o);
            return wasAdded;
        } finally {
            if(!wasAdded){
                sem.release();
            }
        }
    }
    public boolean remove(Object o){
        boolean wasRemoved = set.remove(o);
        if(wasRemoved){
            sem.release();
        }
        return wasRemoved;
    }

    public static void main(String[] args) throws InterruptedException {
        BoundedHashSet<Integer> boundedHashSet = new BoundedHashSet<>(6);
        for(int i=0;i<4;i++){
            boundedHashSet.add(i);
        }
        System.out.println(1);
    }
}
