package com.review2;

import java.util.Scanner;

public class CountSmallerElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size ");
        int size = sc.nextInt();
        int[] array = new int[size];
        int count = 0;
        System.out.println("Enter array elements");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        int smallerNumber = array[0];
        for (int i = 0; i < array.length; i++) {
            if (smallerNumber > array[i]) {
                smallerNumber = array[i];
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (smallerNumber == array[i]) {
                count++;
            }
        }
        System.out.println(smallerNumber + " appear " + count + " times");
    }
}
