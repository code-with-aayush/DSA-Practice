package com.DSATraining;

/*
278. First Bad Version
Easy
You are a product manager and currently leading a team to develop a new product. Unfortunately, the latest version of your product fails the quality check. Since each version is developed based on the previous version, all the versions after a bad version are also bad.

Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one, which causes all the following ones to be bad.

You are given an API bool isBadVersion(version) which returns whether version is bad. Implement a function to find the first bad version. You should minimize the number of calls to the API.
 */



public class day5_question_5 {
    public static void main(String[] args) {
        int n = 4;
        long start = 0;
        long end = n;
        int ans = 1;

        while(start<=end){
            int mid = (int)((start+end)/2);
            boolean check = isBadVersion(mid);
            if(check == true){
                end = mid-1;
                ans = mid;
            }
            else if(check == false){
                start = mid+1;
            }
            else{
                System.out.println(mid);
                return;
            }
        }
        System.out.println(ans);
        return;
    }

    private static boolean isBadVersion(int n) {
        if (n>= 4){
            return true;
        }
        else return false;
    }

}
