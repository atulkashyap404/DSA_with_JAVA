package com.JavaQuestion;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Function and Methods
        int num1,num2,sum;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        num1 = sc.nextInt();
        System.out.print("Enter the Second number : ");
        num2 = sc.nextInt();

        sum = num1+num2;

        System.out.println("the sum of two number is :" +sum);

    }
}
