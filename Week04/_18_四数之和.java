package com.leetcode.algorithm.array;

import java.util.*;

public class _18_四数之和 {
    /**
     * [-3,-1,0,2,4,5]
     * 0
     */


    public static void main(String[] args) {
        int[] nums = {1, 0, -1, 0, -2, 2};
        int[] nums1 = {-3, -1, 0, 2, 4, 5};
        int target = 0;
        List<List<Integer>> resList = fourSum(nums1, target);
        System.out.printf("\nresult is :" + resList.toString());
    }

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        //
        Arrays.sort(nums);
        Set<List<Integer>> list = new LinkedHashSet<>();

        int length = nums.length;
        int tempTarget = 0;
        // 第一层循环 确定第一个数
        for (int i = 0; i < length - 3; i++) {
            // 确定三数和值
            tempTarget = target - nums[i];
            // 边界条件 最小 & 最大
            if (nums[i] + nums[i + 1] + nums[i + 2] + nums[i + 3] > target) break;
            if (nums[length - 1] + nums[length - 2] + nums[length - 3] + nums[length - 4] < target) break;
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            // 第二层循环 找到目标值的和为 tempTarget = target - nums[i] 的三个元素
            for (int j = i + 1; j < length - 2; j++) {
                int k = j + 1;
                int l = length - 1;
                while (k < l) {
                    if (nums[j] + nums[k] + nums[l] == tempTarget) {
                        list.add(Arrays.asList(nums[i], nums[j], nums[k], nums[l]));
                    }
                    if (nums[j] + nums[k] + nums[l] >= tempTarget) {
                        l--;
                    }
                    if (nums[j] + nums[k] + nums[l] < tempTarget) {
                        k++;
                    }
                }
            }

        }
        return new ArrayList<>(list);
    }

}
