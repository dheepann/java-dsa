package com.training;

public class PrimeOrNot {
    public static void main(String[] args) {
        int num = 13;
        System.out.println(isPrime(num));
        System.out.println(isPrimeOptimized(num));
    }

    static boolean isPrimeOptimized(int num) {
        
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    static boolean isPrime(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) count++;
        }

        if (count == 2) return true;
        else {
            return false;
        }
    }
}
