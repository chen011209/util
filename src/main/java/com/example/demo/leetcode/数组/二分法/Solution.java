package com.example.demo.leetcode.数组.二分法;

class Solution {
    public int search(int[] nums, int target) {
        int start=0,end=nums.length-1,tmp;
        while (end>=start){
            tmp=(end+start)/2;

            if (nums[tmp]>target){
                end=tmp-1;
            }
            else if (nums[tmp]<target){
                start=tmp+1;
            }else
                return tmp;
        }
        return -1;
    }
}
