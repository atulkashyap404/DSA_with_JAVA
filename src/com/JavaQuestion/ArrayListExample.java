package com.JavaQuestion;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        ArrayList<Integer> list = new ArrayList<>(10);
//        list.add(23);
//        list.add(43);
//        list.add(55);
//        list.add(12);
//        list.add(22);
//        list.add(54);

//        System.out.println(list);

        // Using some list functions

//        System.out.println(list.contains(55)); //contains() function use

//        list.set(0, 100);
//        System.out.println(list);
        // Adding elements in list through for loop
//        for (int i = 0; i <5 ; i++) {
//            list.add(sc.nextInt());
//        }
//        for (int i = 0; i <5 ; i++) {
//            System.out.println(list.get(i));//pass index here, list[index] syntax will not work here
//        }
        // MultiArraylist
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(sc.nextInt());

            }

        }
        System.out.println(list);

    }
}
