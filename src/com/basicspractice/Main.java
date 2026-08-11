package com.basicspractice;

public class Main {
    public static void main(String[] args) {
        int answer = subtract(10, 4);
        System.out.println(answer);
        System.out.println(multiply(4, 7));
        System.out.println(maximum(99, 98));
        System.out.println(isPositive(-65));
        System.out.println(greet("Dheepan"));

        int[] arr = {5, 12, 7, 20, 3, 7};
        System.out.println(countGreaterThanTen(arr));
        System.out.println(countEven(arr));
        System.out.println(average(arr));

        int target = 7;
        System.out.println(countOccurences(arr, target));
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

    public static int countGreaterThanTen(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 10) {
                count++;
            }
        }
        return count;
    }

    public static int countEven(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    // find minimum is similar to find maximum
    // q4) calculate average
    public static double average(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        double avg = (double) sum / arr.length;
        return avg;
    }

    public static int countOccurences(int[] arr, int target) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                count++;
            }
        }
        return count;
    }
}
