package com.leetcode.recursion;

import java.util.ArrayList;
import java.util.List;

public class _22_括号生成 {
    /**
     * 数字 n 代表生成括号的对数，请你设计一个函数，用于能够生成所有可能的并且 有效的 括号组合。
     * 示例：
     * 输入：n = 3
     * 输出：[
     *        "((()))",
     *        "(()())",
     *        "(())()",
     *        "()(())",
     *        "()()()"
     *      ]
     *
     * 链接：https://leetcode-cn.com/problems/generate-parentheses
     */
    public static List<String> generateParenthesis(int n) {
        List<String> list  = new ArrayList<>();
        generate(list,"",n,0,0);
        return list;
    }

    private static void generate(List<String> list,String string, int count, int left, int right) {
        //1.terminator
        if (left == count && right == count) {
            list.add(string);
            return;
        }
        //2.process
        //3.drill down
        if (left < count)
            generate(list,string+"(",count,left+1,right);
        if (right < left)
            generate(list,string+")",count,left,right+1);
        //4.restore
    }

    public static void main(String[] args) {
        System.out.printf("\n res is : " + generateParenthesis(2).toString());
    }

}
