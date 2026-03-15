package com.DSATraining;

/*
523. Continuous Subarray Sum
Medium
Given an integer array nums and an integer k, return true if nums has a good subarray or false otherwise.

A good subarray is a subarray where:

its length is at least two, and
the sum of the elements of the subarray is a multiple of k.
Note that:

A subarray is a contiguous part of the array.
An integer x is a multiple of k if there exists an integer n such that x = n * k. 0 is always a multiple of k.
 */


import java.util.HashMap;

public class day5_question_3 {
    public static void main(String[] args) {
        int[] nums = {23,2,4,6,7};
        int k = 6;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);

        int sum = 0;

        for (int i = 0; i < nums.length; i++) {

            sum += nums[i];
            int rem = sum % k;

            if (map.containsKey(rem)) {

                if (i - map.get(rem) > 1) {
                    System.out.println(true);
                    return;
                }

            } else {
                map.put(rem, i);
            }
        }

        System.out.println(false);
    }
}
