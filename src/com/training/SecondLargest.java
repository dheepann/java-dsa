package com.training;
// find second largest element in an array
// common interview question

public class SecondLargest {
    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 7, 7, 5};
//        System.out.println(secondLargest(arr)); // brute force approach
        System.out.println(secondLargestOptimal(arr)); // optimal approach
    }

    static int secondLargest(int[] arr) {
        // this is a better approach but not an optimal solution
        //brute force solution:
        int firstMax = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > firstMax) firstMax = arr[i];
        }
        int secondLargest = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > secondLargest && arr[i] != firstMax) secondLargest = arr[i];
        }
        return secondLargest;

    }

    static int secondLargestOptimal(int[] arr) {
        // this is an optimal solution

        int largest = arr[0];
        int sLargest = -1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                sLargest = largest;
                largest = arr[i];
            } else if (arr[i] < largest && arr[i] > sLargest) {
                sLargest = arr[i];
            }
        }
        return sLargest;
    }
}
