package com.example.demo.leetcode.数组.滑动窗口;

class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left,right,sum,count,max=Integer.MAX_VALUE;
        left=right=sum=count=0;

        while (left<nums.length){
            while(sum<target&&right<nums.length){
                sum+=nums[right];
                right++;
                count++;
            }

            if(count<max&&sum>=target)
                max=count;

            sum-=nums[left];
            count--;
            left++;
        }

        if(max==Integer.MAX_VALUE)
            return 0;
        else
            return max;
    }

}