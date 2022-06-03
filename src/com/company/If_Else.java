package com.company;

public class If_Else {
    public static void main(String[] args) {
        int a = 100;
        int b = 15;
        if (b > a) {
            System.out.println("b is greater than a.");
        } else if (b == a) {
            System.out.println("b is equal than a.");
        } else {
            System.out.println("b is not greater.");
        }
    // ternary operator - var = (condition) ? expressionTrue :  expressionFalse;
        String result = (b > a) ? "b is greater than a." :  "b is not greater.";
        System.out.println(result);
    }
}
