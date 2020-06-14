package com.leetcode.array;

import java.util.Arrays;

public class _283_移动零 {

    public static void main(String[] args) {
        int [] arr = {1,3,0,8,9,0};
        System.out.printf("\n final arr is : " + Arrays.asList(arr).toString());
    }

    public static void moveZeroes(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (num != 0) nums[count++] = num;
        }
        while (count < nums.length) {
            nums[count++] = 0;
        }
    }

}
