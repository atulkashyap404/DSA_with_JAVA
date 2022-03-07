package com.JavaQuestion;

import jdk.dynalink.beans.StaticClass;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
    int ans = sum2(20, 30);
    System.out.println(ans);
    }

    static int sum2(int a, int b){
        int sum = a + b;
        return sum;
    }

    /*
    static int sum2(){
        Scanner sc = new Scanner(System.in);

        int num1, num2, sum;
        System.out.println("Enter the num1 number :");
        num1 = sc.nextInt();
        System.out.println("Enter the num2 number :");
        num2 = sc.nextInt();
        sum = num1+num2;
        return sum;

    }
    */

}
