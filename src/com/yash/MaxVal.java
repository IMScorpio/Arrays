package com.yash;

class MaxVal{
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10};
        System.out.println(maxRange(arr,1, 5));

    }
    static  int maxRange(int[] arr, int start, int end){
        int maxVal = arr[start];
        for (int i = start; i < end; i++) {
            if(arr[i] > maxVal){
                maxVal = arr[i];
            }

        }
        return maxVal;
    }
    static int max(int[] arr){
        int maxVal = arr[0];
        for (int i = 1; i <arr.length ; i++) {
            if(arr[i] > maxVal){
                maxVal = arr[i];
            }
        }
        return  maxVal;
    }
}