package com.leetcode.array;

import java.util.Arrays;

public class _66_加一 {
    /*
        给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。

        最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。

        你可以假设除了整数 0 之外，这个整数不会以零开头。

        示例 1:

        输入: [1,2,3]
        输出: [1,2,4]
        解释: 输入数组表示数字 123。
        示例 2:

        输入: [4,3,2,1]
        输出: [4,3,2,2]
        解释: 输入数组表示数字 4321。
     */
    public static void main(String[] args) {
        int[] arr = {9, 9, 9};
        plusOne1(arr);
        System.out.printf("\nres is : " + Arrays.toString(arr));

//        System.out.printf("\n res is : " + Arrays.toString(arr));
    }

    public static int[] plusOne1(int[] digits) {
        int len = digits.length;
        for (int i = len - 1; i >= 0; i--) {
            digits[i]++;
            digits[i] %= 10;
            System.out.printf("\neach i : "+ i+" arr is : " + Arrays.toString(digits));
            if (digits[i] != 0)
                return digits;
        }
        digits = new int[len + 1];
        digits[0] = 1;
        return digits;
    }


    public static int[] plusOne(int[] arr) {
        int len = arr.length;
        for (int i = len - 1; i >= 0; i--) {
            arr[i] += 1;
            arr[i] = arr[i] % 10;
            System.out.printf("\neach i : "+ i+" arr is : " + Arrays.toString(arr));
            if (arr[i] != 0) return arr;
        }
        arr = new int[len + 1];
        arr[0] = 1;
        return arr;
    }
}
