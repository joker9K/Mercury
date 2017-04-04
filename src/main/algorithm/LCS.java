package main.algorithm;

/**
 * @author supo
 * @Date 2017/3/22 13:57.
 * Copyright © mizhuanglicai
 */
public class LCS {

    public static int method1(int[] sequence) {
        int max = 0;
        int n = sequence.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = 0;
            for (int j = i; j < n; j++) {
                sum += sequence[j];
                if (sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }


    public static int method2(int[] sequence) {
        int max = 0;
        int n = sequence.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += sequence[i];
            if (sum > max) {
                max = sum;
            } else if (sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] a = {-2, 11, -4, 13, -5, 2, -5, -3, 12, -9};
        System.out.println(method2(a));
    }
}
