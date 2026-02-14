package com.DSATraining;

public class day3 {
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
