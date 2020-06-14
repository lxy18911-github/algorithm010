package com.leetcode.array;

public class _7_整数反转 {

    public static void main(String[] args) {
        int a = -187;
        System.out.printf("\nres is :" + reverse(a));
    }

    public static int reverse(int x) {
        boolean flag = x > 0 ? true : false;
        if (!flag)// 负数 去掉'-'
            x *= -1;
        String str = String.valueOf(x);
        char[] strings = str.toCharArray();
        int length = strings.length;
        for (int i = 0; i < length / 2; i++) {
            char tmp = strings[i];
            strings[i] = strings[length - i - 1];
            strings[length - i - 1] = tmp;
        }
        int res = Integer.parseInt(String.valueOf(strings));
        if (flag)
            return res;
        else
            return -1 * res;

    }
}
