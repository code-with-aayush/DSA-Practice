package com.DSATraining;

/*
268. Missing Number
Solved
Easy
Topics
premium lock icon
Companies
Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
 */



public class day3_question_3 {
    public static void main(String[] args) {


        int[] nums = {0,3,2};
        int i = 0;
        int n = nums.length;
        while (i < n) {
            int correct = nums[i];
            if (nums[i]<n && nums[i] != nums[correct]){
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            }
            else {
                i++;
            }

        }
        for (int j = 0; j < n; j++) {
            if (nums[j] != j){
                System.out.println(j);
                return;
            }
        }
        System.out.println(nums.length);
    }
}
