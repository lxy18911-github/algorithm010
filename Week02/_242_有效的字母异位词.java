package com.leetcode.hash;

import java.util.Arrays;

public class _242_有效的字母异位词 {
    /**
     * 给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。
     * 示例 1:
     * 输入: s = "anagram", t = "nagaram"
     * 输出: true
     * 示例 2:
     * <p>
     * 输入: s = "rat", t = "car"
     * 输出: false
     */
    public static boolean isAnagram(String s, String t) {
        char[] strings1 = s.toCharArray();
        char[] strings2 = t.toCharArray();
        Arrays.sort(strings1);
        Arrays.sort(strings2);
//        return Arrays.equals(strings1, strings2);
        return Arrays.toString(strings1).equalsIgnoreCase(Arrays.toString(strings2));
    }

    public static void main(String[] args) {
        String s = "anagram",t = "nagaram";
//        String t = "cat";
        System.out.printf("\n res is : " + isAnagram(s, t));
    }

}
