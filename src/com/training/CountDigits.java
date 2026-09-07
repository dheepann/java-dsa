package com.training;

public class CountDigits {
    public static void main(String[] args) {
        int num = 321123;
        System.out.println(countDigits(num));
    }

    static int countDigits(int n) {
        int count = 0, rem;
        while (n != 0) {
            if (n % 10 != 0) {
                count++;
            }
            n /= 10;
        }
        return count;
    }
}
