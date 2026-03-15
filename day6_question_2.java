package com.DSATraining;

/*
33. Search in Rotated Sorted Array
Medium
There is an integer array nums sorted in ascending order (with distinct values).

Prior to being passed to your function, nums is possibly left rotated at an unknown index k (1 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,5,6,7] might be left rotated by 3 indices and become [4,5,6,7,0,1,2].

Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.

You must write an algorithm with O(log n) runtime complexity.
 */


public class day6_question_2{
    public static void main(String[] args) {
        int[] nums = {7,8,9,1,2,3,4,5,6};
        int target = 5;
        int n = nums.length;
        int start = 0;
        int end = n-1;

        while(start <= end){
            int mid = start + (end-start)/2;
            if(nums[mid] == target){
                System.out.println(mid);
                return;
            }
            else if (nums[start] <= nums[mid]) {
                if (target >= nums[start] && target <= nums[mid]){
                    end = mid-1;
                }
                else start = mid+1;

            }
            else {
                if (target > nums[mid] && target <= nums[end]){
                    start = mid+1;
                }
                else end = mid-1;
            }
        }
        System.out.println(-1);
    }
}
