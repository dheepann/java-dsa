package com.basicspractice;

import java.util.Arrays;

public class ReverseAnArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(reverse(arr)));
    }

    public static int[] reverse(int[] arr) {

        for (int i = 0; i < arr.length / 2; i++) {
            swap(arr, i, arr.length - 1 - i);

        }
        return arr;
    }

    public static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }


    // alternate and better approach:
    public static int[] reverse2(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
        return arr;
    }
}
