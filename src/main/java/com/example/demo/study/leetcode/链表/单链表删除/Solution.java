package com.example.demo.study.leetcode.链表.单链表删除;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */



//单链表删除涉及删除初始节点和中间节点两种情况，所以可以设置一个初始的虚拟节点

class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode virtualHead=new ListNode(-1,head);
        ListNode cur=head;
        ListNode pre=virtualHead;

        while (cur!=null){
            if(cur.val==val){
                pre.next=cur.next;
            }else {
                pre=pre.next;
            }
            cur=cur.next;
        }
        return virtualHead.next;
    }
}