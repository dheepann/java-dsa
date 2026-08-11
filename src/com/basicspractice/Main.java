package com.basicspractice;

public class Main {
    public static void main(String[] args) {
        int answer = subtract(10, 4);
        System.out.println(answer);
        System.out.println(multiply(4, 7));
        System.out.println(maximum(99, 98));
        System.out.println(isPositive(-65));
        System.out.println(greet("Dheepan"));
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int maximum(int a, int b) {
        if (a < b) {
            return b;
        } else {
            return a;
        }
    }

    public static boolean isPositive(int n) {
        return n > 0;
    }

    public static String greet(String name) {
        return "Hello " + name;
    }
}
