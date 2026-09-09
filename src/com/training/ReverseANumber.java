package com.training;

public class ReverseANumber {
    public static void main(String[] args) {
        int num = 345;
        System.out.println(reverse(num));
    }

    static int reverse(int n) {
        int original = n;
        int reverse = 0, rem;
        while (n != 0) {
            rem = n % 10;
            reverse = (reverse * 10) + rem;
            n = n / 10;
        }
        

        return reverse;
    }
}
