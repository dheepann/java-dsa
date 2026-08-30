package com.recursion;
// given the index find the corresponding number in the fibonacci series

public class FibonacciUsingRecursion {
    public static void main(String[] args) {
        System.out.println(fibo(7));
    }

    static int fibo(int n) {
        if (n < 2) return n;
        return fibo(n - 1) + fibo(n - 2);
    }
}
