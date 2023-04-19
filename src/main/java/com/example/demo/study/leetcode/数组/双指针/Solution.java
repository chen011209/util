package com.example.demo.study.leetcode.数组.双指针;

class Solution {
    //暴力嗯解
//    public int[] sortedSquares(int[] nums) {
//        for (int i = 0; i < nums.length; i++) {
//            nums[i]=nums[i]*nums[i];
//        }
//        Arrays.sort(nums);
//        return nums;
//    }


//
//    public int[] sortedSquares(int[] nums) {
//        int right = nums.length - 1;
//        int left = 0;
//        int[] result = new int[nums.length];
//        int index = result.length - 1;
//        while (left <= right) {
//            if (nums[left] * nums[left] > nums[right] * nums[right]) {
//                result[index--] = nums[left] * nums[left];
//                ++left;
//            } else {
//                result[index--] = nums[right] * nums[right];
//                --right;
//            }
//        }
//        return result;
//    }

    public int[] sortedSquares(int[] nums) {
       int left=0,right=nums.length-1;
       int index=right;
       int []newNums=new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if(Math.abs(nums[left])>Math.abs(nums[right])){
                newNums[index]=nums[left]*nums[left];
                left++;
                index--;
            }else {
                newNums[index]=nums[right]*nums[right];
                right--;
                index--;
            }
        }

        return newNums;
    }



}