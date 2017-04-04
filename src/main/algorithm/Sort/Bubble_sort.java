package main.algorithm.Sort;

/**
 * @author supo
 * @Date 2017/3/22 12:00.
 * Copyright © mizhuanglicai
 */
public class Bubble_sort {

    public static int[] sort(int a[], int n) {
        int temp;
        boolean flag = true;
        for (int i = 1; i < n && flag; i++) {
            flag = false;
            for (int j = n-i; j > 0; j--) {//j < n-i中i代表数组末尾已经排好序的i个元素
                if (a[j] < a[j - 1]) {
                    temp = a[j];
                    a[j] = a[j - 1];
                    a[j-1] = temp;
                    flag = true;
                }
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int[] a = {3, 5, 1, 7, 2, 8};
        a = sort(a, a.length);
        for(Integer integer : a){
            System.out.print(integer+" ");
        }
    }
}
