package com.DSATraining;

/*
242. Valid Anagram
Easy
Topics
premium lock icon
Companies
Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 */



public class day5_question_1 {
    public static void main(String[] args) {
        String s = "cat";
        String t = "rat";
        int a = s.length();
        int b = t.length();
        if(a != b){
            System.out.println(false);
            return;

        }
        else{
            int[] count = new int[26];

            for(int i = 0; i < a; i++){
                count[s.charAt(i) - 'a']++;
            }
            for(int i = 0; i < b; i++){
                count[t.charAt(i) - 'a']--;
            }
            for(int i = 0; i < count.length; i++){
                if(count[i] != 0){
                    System.out.println(false);
                    return;

                }
            }
            System.out.println(true);
            return;

        }
    }
}
