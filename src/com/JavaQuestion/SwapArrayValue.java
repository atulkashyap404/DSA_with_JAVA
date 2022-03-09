package com.JavaQuestion;

import java.util.Arrays;

public class SwapArrayValue {
    public static void main(String[] args) {
//        System.out.println("Before");
        int[] arr = {1, 3, 23, 9, 18};
//        System.out.println(Arrays.toString(arr));
//        swap(arr, 1, 3);
//        System.out.println("After");
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    // Reverse an Array
    static void reverse(int[] arr)
    {
        int start = 0;
        int end = arr.length-1;

        while (start < end)
        {
            swap(arr, start,end);
            start++;
            end--;
        }

    }

    static void swap(int[] arr, int index1, int index2)
    {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

}
