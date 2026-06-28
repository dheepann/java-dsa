package com.binarysearch;

public class Ceiling {
    public static void main(String[] args) {
        int[] arr = {-8, -3, 0, 18, 24, 66, 79, 100};
        int target = -4;
        int ans = ceiling(arr, target);
        System.out.println(ans);
    }


    // return the index of smallest no>=target
    static int ceiling(int[] arr, int target) {

        // but what if the target is greater than the greatest number in the array
        if (target > arr[arr.length - 1]) {
            return -1;
        }

        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {

            // find the middle element
            int mid = start + (end - start) / 2; // might be possible that (start + end) exceeds the range of int in java
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }

        return start;
    }
}