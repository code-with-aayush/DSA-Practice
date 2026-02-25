package com.DSATraining;


/*
HASHMAP

question: Leetcode two sum using hashmap.
 */


import java.util.Arrays;
import java.util.HashMap;

public class day4_question_1 {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int compliment = target-nums[i];
            if (map.containsKey(compliment)){
                System.out.print(Arrays.toString(new int[]{map.get(compliment),i}));
                return;
            }
            map.put(nums[i],i);
        }
        System.out.println(Arrays.toString(new int[]{}));
    }

}
