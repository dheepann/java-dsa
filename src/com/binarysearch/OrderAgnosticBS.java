package com.binarysearch;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {100, 79, 66, 24, 6, 0, -3, -8};
        int target = 66;
        int ans = orderagnosticbs(arr, target);
        System.out.println(ans);
    }

    // return the index
    // return -1 if it does not exist
    static int orderagnosticbs(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            // find the middle element
            int mid = start + (end - start) / 2; // might be possible that (start + end) exceeds the range of int in java
            if (target > arr[mid]) {
                end = mid - 1;
            } else if (target < arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}