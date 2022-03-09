package com.JavaQuestion;

import java.util.*;

public class TwoArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        System.out.println("Enter the arrays elemets");
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {

                arr[row][col] = sc.nextInt();
            }
        }
        // enhance for loop use here
        for (int[] ints : arr) {
            System.out.println(Arrays.toString(ints));
        }
        /*
        ***-----regular for loop for printing array elements---****
         for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col]+"\t");
            }
            System.out.print("\n");
        }
         */


    }
}
