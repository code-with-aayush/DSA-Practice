package com.DSATraining;

//1. Two Sum
//Easy
//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
//
//You can return the answer in any order.


public class day1_question_2 {
    public static void main(String[] args) {
            int[] nums = {1,7,2,15};
            int target = 9;
            int n=nums.length;
            for(int i=1;i<n;i++){
                for(int j=i;j<n;j++){
                    if(nums[j-i]+nums[j]==target){
                        System.out.println(j-i+ ","+j);
                    }
                }
            }
        }

}
