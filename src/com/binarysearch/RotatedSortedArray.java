package com.binarysearch;

//https://leetcode.com/problems/search-in-rotated-sorted-array/description/
public class RotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int target = 6;
        System.out.println(findPivot(arr));

    }

    static int search(int[] nums, int target) {
        int pivot = findPivot(nums);

        //if pivot not found then the array is not rotated
        if (pivot == -1) {
            //just do normal binary search
            return binarySearch(nums, target, 0, nums.length - 1);
        }

        //if pivot not found, you have 2 ascending sorted arrays
        if (nums[pivot] == target) {
            return pivot;
        }
        if (target >= nums[0]) {
            return binarySearch(nums, target, 0, pivot - 1);
        }
        return binarySearch(nums, target, pivot + 1, nums.length - 1);
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
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

    //this will not work for duplicate values
    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            //4 cases over here
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if (arr[mid] <= arr[start]) { // from here the code will fail if the mid,start and end in the array are duplicates
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

}

static int findPivotWithDuplicates(int[] arr) {
    int start = 0;
    int end = arr.length - 1;
    while (start <= end) {
        int mid = start + (end - start) / 2;

        //4 cases over here
        if (mid < end && arr[mid] > arr[mid + 1]) {
            return mid;
        }
        if (mid > start && arr[mid] < arr[mid - 1]) {
            return mid - 1;
        }
        // if the elements at start,mid and end are equal then skip them
        if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
            //skip the duplicates
            //NOTE: but what if the start and end were the pivot?
            //check if start is pivot
            if (arr[start] > arr[start + 1]) {
                return start;
            }
            start++;
            //check if end is pivot
            if (arr[end] < arr[end - 1]) {
                return end - 1;
            }
            end--;
        }
    }
    return -1;
}