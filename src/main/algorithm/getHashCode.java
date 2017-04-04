package main.algorithm;

/**
 * @author supo
 * @Date 2017/3/30 16:45.
 * Copyright © mizhuanglicai
 */
public class getHashCode {
    public static void main(String[] args) {
        String s = "a";
        System.out.println(getHashcodeByIntArray(s));
    }


    public static int getHashcodeByIntArray(String str) {
        int h = 0;
        int len = str.length();
        int hash = 0;
        if (h == 0 && len > 0) {
            int off = 0;
            int val[] = strToAscii(str);
            for (int i = 0; i < len; i++) {
                h = 31 * h + val[off++];
            }
            hash = h;
        }
        return h;
    }

    private static int[] strToAscii(String str) {
        char[] chars = str.toCharArray();

        int[] ascillCode = new int[chars.length];

        for (int i = 0; i < chars.length; i++) {
            System.out.println("" + chars[i] + " = " + (int) chars[i]);
            ascillCode[i] = (int) chars[i];
        }
        return ascillCode;
    }
}
