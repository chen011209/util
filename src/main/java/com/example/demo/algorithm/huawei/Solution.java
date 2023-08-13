package com.example.demo.algorithm.huawei;

import java.util.*;





class Solution {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode deleteNode(ListNode head, int val) {


        if(head.val == val)
            return head.next;

        ListNode cur = head.next;
        ListNode pre = head;


        while (cur!=null){
            if(cur.val == val){
                pre.next = cur.next;
                break;
            }
            cur = cur.next;
            pre = pre.next;
        }
        return head;
    }
}