package com.DSATraining;

/*
128. Longest Consecutive Sequence
Medium
Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.

You must write an algorithm that runs in O(n) time.


 */


import java.util.HashSet;
import java.util.Set;

public class day5_question_2 {
    public static void main(String[] args) {
        int[] nums = {100,4,200,1,3,2};
        System.out.println(longestConsecutive(nums));
    }

    public static int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }

        Set<Integer> set = new HashSet<>();

        for(int i:nums){
            set.add(i);
        }

        int longestsequence = 0;
        for(int i : set){
            if(!set.contains(i-1)){
                int currentlength = 1;
                while(set.contains(i+1)){
                    i++;
                    currentlength++;
                }
                longestsequence = Math.max(longestsequence,currentlength);
            }
        }
        return longestsequence;
    }
}

