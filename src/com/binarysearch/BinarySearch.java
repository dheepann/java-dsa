package com.binarysearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-41, -21, -7, 0, 56, 60, 74, 79, 87, 91, 98};
        int target = 91;
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
        return -1;
    }
}
