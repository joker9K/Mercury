package main.concurrent;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author supo
 * @Date 2017/3/20 21:28.
 * Copyright © mizhuanglicai
 */
public class ListHelper<E> {
    public List<E> list = Collections.synchronizedList(new ArrayList<E>());

    public synchronized  boolean putIfAbsent(E x){
        boolean absent = !list.contains(x);
        if(absent){
            list.add(x);
        }
        return absent;
    }

    public static void main(String[] args) {
        ListHelper<String> helper = new ListHelper<>();
        new Thread(() -> {
            helper.putIfAbsent("a");
        }).start();
        helper.putIfAbsent("a");
    }
}
