package com.arrays;
// https://leetcode.com/problems/richest-customer-wealth/

public class MaxWealth {
    public static void main(String[] args) {

    }

    static int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;
//        for (int person = 0; person < accounts.length; person++) {
//            int sum = 0;
//            for (int account = 0; account < accounts[person].length; account++) {
//                sum += accounts[person][account];
//
//            }
//            if (sum > max) {
//                max = sum;
//            }
//
//        }
//        return max;
        // using enhanced for loop
        for(int[] element: accounts) {
            int sum=0;
            for(int ints: element) {
                sum+=ints;

            }
            if(sum>max) {
                max = sum;
            }
        }
        return max;

    }
}
