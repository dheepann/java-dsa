package com.methods;

import java.util.Scanner;

public class ReturnSum {
    public static void main(String[] args) {
        int ans = sum2();
        System.out.println(ans);

    }

    //return the value with return type int
    static int sum2() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number1:");
        int num1 = in.nextInt();
        System.out.println("Enter number2:");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        return sum;
    }
}
