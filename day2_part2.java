package com.DSATraining;

import java.util.Arrays;

public class day2_part2 {
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
