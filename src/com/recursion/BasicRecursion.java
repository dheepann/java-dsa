package com.recursion;
// debug this code

public class BasicRecursion {
    public static void main(String[] args) {
        print(1);
    }

    static void print(int n) {
        if (n == 6) return; // base condition: recursion will stop making new calls here

        System.out.println(n);

        print(n + 1); // function calling itself or recursive function. this is called tail recursion
    }
}
