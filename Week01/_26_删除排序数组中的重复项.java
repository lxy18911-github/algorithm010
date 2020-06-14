package com.leetcode.array;

public class _26_删除排序数组中的重复项 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3, 4, 0};
        System.out.printf("\nlen is :" + removeDuplicates(arr));
    }

    /*
        给定一个排序数组，你需要在 原地 删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
        不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。

     */
    public static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;
        int i = 0, j = 1, len = nums.length;
        while (j < len) {
            if (nums[i] != nums[j]) {
                nums[i + 1] = nums[j];
                i++;
            }
            j++;
        }
        return i + 1;
    }

}
