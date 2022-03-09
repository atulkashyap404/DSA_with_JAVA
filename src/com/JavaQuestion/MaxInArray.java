package com.JavaQuestion;

public class MaxInArray {
    public static void main(String[] args) {
        int[] arr = {1, 3, 23, 99, 18};
       int val= maxRange(arr, 1, 3);
        System.out.println(val);
    }
//    static int max(int[] arr)
//    {
//        int maxvalue = arr[0];
//        for (int i = 0; i <arr.length ; i++) {
//            if(arr[i] > maxvalue)
//            {
//                maxvalue = arr[i];
//            }
//        }
//        return maxvalue;
//        }
    static int maxRange(int[] arr, int start, int end)
{
    int maxvalue = arr[0];
    for (int i = start; i <= end ; i++) {
        if(arr[i] > maxvalue)
        {
            maxvalue = arr[i];
        }
    }
    return maxvalue;
    }
}
