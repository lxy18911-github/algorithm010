package com.leetcode.recursion;

public class _70_爬楼梯 {

    public static int climbStairs(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;
        return climbStairs(n-1) + climbStairs(n-2);
    }

    public static void main(String[] args) {
        System.out.printf("\nres is : " + climbStairs(6));
    }

}
