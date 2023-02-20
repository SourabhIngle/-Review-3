package com.review2;

import java.util.Scanner;

public class EvenFibonacciNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the Nth number to get Even fibonacci number: ");
        short number = sc.nextShort();
        System.out.println("Enter the number for even number:");
        byte even = sc.nextByte();
        int firstNumber = 0;
        int secondNumber = 1;
        int next = 0;
        int count = 0;
        for (int i = 1; i <= number; i++) {
            next = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = next;

            if (firstNumber % 2 == 0) {
                count++;
                if (count == even) {
                    System.out.println(firstNumber);
                }
            }
        }
    }
}
