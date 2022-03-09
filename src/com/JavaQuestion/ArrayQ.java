package com.JavaQuestion;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayQ {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

    // Array of primitives
       /*
        // Taking input in array  through for loop and print as well.
        int[] arr = new int[10];
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = sc.nextInt();
        }
        // below we use enhance for loop which is foreach loop to print the element of the array.

        for (int i : arr) {
            System.out.print(i + " ");

        }


        // one more way to print array is using toString() method
        System.out.println(Arrays.toString(arr));

        */


    // Array of Objects
        String[] str = new String[5];
        for (int i = 0; i < str.length ; i++) {
            str[i] = sc.next();
        }
        System.out.println(Arrays.toString(str));


    }
}
