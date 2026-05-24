package com.methods;

public class SumParameters {
    public static void main(String[] args) {
        int total = sum2(20, 25);
        System.out.println(total);
    }

    static int sum2(int a, int b) {
        int result = a + b;
        return result;
    }
}
