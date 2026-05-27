package com.arrays;

public class FindMin {
    public static void main(String[] args) {
        int[] arr = {-11, -1, 0, 58, 32, 55, 109, -44};
        int ans = min(arr);
        System.out.println(ans);
    }

    static int min(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

}
