package com.example.demo.study.leetcode.数组.快慢指针;

class Solution {
    public int removeElement(int[] nums, int val) {

//        //快指针处理数组 慢指针生成新数组


//
//        // 快慢指针
//        int fastIndex = 0;
//        int slowIndex;
//        for (slowIndex = 0; fastIndex < nums.length; fastIndex++) {
//            if (nums[fastIndex] != val) {
//                nums[slowIndex] = nums[fastIndex];
//                slowIndex++;
//            }
//        }
//        return slowIndex;



        // 快慢指针
        int fastIndex = 0,slowIndex=0;
        while (fastIndex<nums.length){

            if (nums[fastIndex] == val) {
                fastIndex++;
            }else {
                nums[slowIndex] = nums[fastIndex];
                fastIndex++;
                slowIndex++;
            }
        }


        return slowIndex;


    }
}