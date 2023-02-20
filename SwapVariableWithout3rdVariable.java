package com.review2;

import java.util.Scanner;

public class SwapVariableWithout3rdVariable {
    public static void main(String[] args) {
        int firstNumber = 60;
        int secondNumber = 86;

        firstNumber = firstNumber + secondNumber; // 146
        secondNumber = firstNumber - secondNumber;//60
        firstNumber = firstNumber - secondNumber;//86
        System.out.println("First number is " + firstNumber);
        System.out.println("First number is " + secondNumber);
    }
}
