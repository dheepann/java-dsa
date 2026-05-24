package com.methods;

import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        int[] arr = {33, 1, 43, 67, 69, 56};
        change(arr);
        System.out.println(Arrays.toString(arr));


    }

    static void change(int[] nums) {
        nums[0] = 12;

    }
}
