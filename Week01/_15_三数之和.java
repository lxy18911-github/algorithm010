package com.leetcode.array;

import java.util.*;

public class _15_三数之和 {

    public static void main(String[] args) {
        int[] nums = {1, 2, 5, -4, 0, -5, 4};
        int[] nums1 = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> resList = threeSum(nums1);
        System.out.printf("\nresult is :" + resList.toString());
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        //
        Arrays.sort(nums);
        Set<List<Integer>> list = new LinkedHashSet<>();

        int length = nums.length;
        for (int i = 0; i < length - 2; i++) {
            if (nums[i] > 0) continue;
            int j = i + 1;
            int k = length - 1;
            while (j < k) {
                if (nums[i] + nums[j] + nums[k] == 0) {
                    list.add(Arrays.asList(nums[i], nums[j], nums[k]));
                }
                if (nums[i] + nums[j] + nums[k] >= 0) {
                    k--;
                }
                if (nums[i] + nums[j] + nums[k] < 0) {
                    j++;
                }
            }
        }
        return new ArrayList<>(list);
    }

}
