package com.DSATraining;
/*
162. Find Peak Element
Medium
A peak element is an element that is strictly greater than its neighbors.

Given a 0-indexed integer array nums, find a peak element, and return its index. If the array contains multiple peaks, return the index to any of the peaks.

You may imagine that nums[-1] = nums[n] = -∞. In other words, an element is always considered to be strictly greater than a neighbor that is outside the array.

You must write an algorithm that runs in O(log n) time.
 */


public class day5_question_6 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        int start = 0;
        int end = nums.length-1;
        if(nums.length<=0){
            System.out.println(-1);
            return;
        }
        while(start<end){
            int mid = start+(end-start)/2;


            if(nums[mid+1]>nums[mid]){
                start = mid+1;
            }

            else{
                end = mid;
            }
        }
        System.out.println(start);
        return;
    }
}
