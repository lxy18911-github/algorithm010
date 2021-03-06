package com.leetcode.linklist;

public class _206_反转链表 {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        reverseListByRecursion(head);
//        System.out.printf("res is :" + toString(reverseList(head)));
    }

    public static ListNode reverseListByRecursion(ListNode head) {
        //递归终止条件是当前为空，或者下一个节点为空
        if (head == null || head.next == null) {
            System.out.printf("\n1-->" + head.val);
            return head;
        }
        //这里的cur就是最后一个节点
        ListNode cur = reverseListByRecursion(head.next);
        //这里请配合动画演示理解
        //如果链表是 1->2->3->4->5，那么此时的cur就是5
        //而head是4，head的下一个是5，下下一个是空
        //所以head.next.next 就是5->4
        head.next.next = head;
        //防止链表循环，需要将head.next设置为空
        head.next = null;
        //每层递归函数都返回cur，也就是最后一个节点
        System.out.printf("\n cur node is : " + cur.val);
        return cur;
    }

    public static ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        while (cur != null) {
            ListNode next = cur.next;
            head.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static String toString(ListNode head) {
        StringBuffer sb = new StringBuffer();
        while (head.next != null) {
            sb.append(head.val + "->");
            head = head.next;
        }
        return sb.toString();
    }

}
