package com.company;

public class Scope {
    public static void main(String[] args) {

        // Code here CANNOT use x

        int x = 100;

        // Code here can use x
        System.out.println(x);
    }
}
