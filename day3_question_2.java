package com.DSATraining;

/*
26. Remove Duplicates from Sorted Array
Easy
Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same.

Consider the number of unique elements in nums to be k​​​​​​​​​​​​​​. After removing duplicates, return the number of unique elements k.

The first k elements of nums should contain the unique numbers in sorted order. The remaining elements beyond index k - 1 can be ignored.

Custom Judge:

The judge will test your solution with the following code:

int[] nums = [...]; // Input array
int[] expectedNums = [...]; // The expected answer with correct length

int k = removeDuplicates(nums); // Calls your implementation

assert k == expectedNums.length;
for (int i = 0; i < k; i++) {
    assert nums[i] == expectedNums[i];
}
If all assertions pass, then your solution will be accepted.

*/


import java.util.Arrays;

public class day3_question_2 {
    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3,4,4};
        int result = 0;
        int n = nums.length;
        for(int i=0; i< n; i++){
            if(i < nums.length-1 && nums[i] == nums[i+1]){
                continue;
            }
            else{
                nums[result] = nums[i];
                result++;
            }
        }
        System.out.println(result);
        }
}
