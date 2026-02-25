package com.DSATraining;
import java.util.Arrays;

//283. Move Zeroes
//Easy
//Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
//Note that you must do this in-place without making a copy of the array.


public class day3_question_1 {
    public static void main(String[] args) {
         {  int[] nums = {0,1,0,3,12};
            int nonzero = 0 ;

            for(int i = 0; i<nums.length; i++){
                if(nums[i] != 0){
                    nums[nonzero] = nums[i];
                    nonzero++;
                }
            }
            for(int i = nonzero; i< nums.length; i++){
                nums[i] = 0;
                }

             System.out.println(Arrays.toString(nums));
            }
        }

    }
