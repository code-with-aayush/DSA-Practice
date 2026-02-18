package com.DSATraining;
//53. Maximum Subarray
//Solved
//Medium
//Topics
//premium lock icon
//Companies
//Given an integer array nums, find the subarray with the largest sum, and return its sum.


public class day2_question_2 {
    public static void main(String[] args) {
            int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
            int sum = 0;
            int max = -99999;

            for(int i = 0 ; i<nums.length ; i++){
                sum += nums[i];

                if(sum > max){
                    max = sum;
                }

                if(sum < 0){
                    sum = 0;

                }
            }
            System.out.println(max);

        }
}
