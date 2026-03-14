package com.DSATraining;

/*
560. Subarray Sum Equals K
Medium

Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.

A subarray is a contiguous non-empty sequence of elements within an array.
 */


import java.util.HashMap;

public class day5_question_4 {
    public static void main(String[] args) {
        int[] nums = {1,1,1};
        int k = 2;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);

        int result=0;
        int prefixsum=0;

        for(int num : nums){
            prefixsum += num;

            if(map.containsKey(prefixsum-k)){
                result += map.get(prefixsum-k);
            }

            map.put(prefixsum, map.getOrDefault(prefixsum , 0) +1);
        }

        System.out.println(result);
    }
}
