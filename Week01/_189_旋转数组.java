package com.leetcode.array;

import java.util.Arrays;

public class _189_旋转数组 {

    public static void main(String[] args) {
        int [] a = {1,2,3,4,5,6,7};
        rotate(a,3);
        System.out.printf("final array is : " + Arrays.toString(a));
    }
    /*
    给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。
     */
    public static void rotate(int[] nums, int k) {

        if (nums == null || nums.length ==0 || k < 0) return;
        int len = nums.length;
//        k = k % len;
        // 反转整个数组元素
        reverseArray(nums,0,len);
        // 反转K位置之前的数组元素
        reverseArray(nums,0,k);
        // 反转K位置之后的数组元素
        reverseArray(nums,k,len);

    }

    public static void reverseArray(int[] a,int start,int end) {
        int temp;
        for (int i = start; i < end; i++) {
            temp = a[i];
            a[i] = a[end-1];
            a[end-1] = temp;
            end --;
        }
    }
}
