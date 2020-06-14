package com.leetcode.array;

public class _11_盛水最多容器 {

    public static void main(String[] args) {
        int [] height = {1,8,6,2,5,4,8,3,7};
        // 1,8,6,2,5,4,8,3,7
        // 2,4,3,1,7,9
        System.out.printf("\nthe area is :" + maxArea(height));
    }

    public static int maxArea(int[] a) {
        int maxArea = 0;
        int length = a.length;
        for (int i = 0,j= length-1;i < j;) {
            int minHeight = a[i] < a[j] ? a[i++]:a[j--];
            int area = (j - i + 1) * minHeight;
            maxArea = Math.max(maxArea,area);
        }
        return maxArea;
    }
    public static int maxArea1(int[] height) {
        int area = 0;
        int l = 0,r = height.length - 1;
        while (l < r) {
            int tArea = Math.min(height[l],height[r]) * (r - l);
            area = Math.max(area,tArea);
            if (height[l] <= height[r]) {// 左边小 移动左指针
                l++;
            } else { // 右边小 移动右指针
                r--;
            }
        }
        return area;
    }

}
