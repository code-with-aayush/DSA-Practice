package com.DSATraining;

/*
35. Search Insert Position
Easy
Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You must write an algorithm with O(log n) runtime complexity.
 */


public class day6_question_1 {
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 5;
        int n = nums.length;
        int start = 0;
        int end = n-1;
        while(start <= end){
            int mid = start + ((end - start)/2);
            if(nums[mid] == target){
                System.out.println(mid);
                return;
            }
            else if(target > nums[mid]){
                start = mid+1;
            }
            else{
                end = mid -1;
            }
        }
        System.out.println(start);
    }
}
