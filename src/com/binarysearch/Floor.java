package com.binarysearch;

public class Floor {
    public static void main(String[] args) {
        int[] arr = {-8, -3, 0, 18, 24, 66, 79, 100};
        int target = -3;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }

    // return the index
    // return -1 if it does not exist
    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            // find the middle element
            int mid = start + (end - start) / 2; // might be possible that (start + end) exceeds the range of int in java
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return end;
    }
}
