package com.DSATraining;

public class day1 {
    public static void main(String[] args) {
        int[] arr = {-1,5,4,9,-5,2};
        int first = -99999;
        int second = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > first){
                second = first;
                first = arr[i];
            }
            else if (arr[i] > second && arr[i] < first) {
                second = arr[i];

            }
        }
        System.out.println(second);

    }

}
