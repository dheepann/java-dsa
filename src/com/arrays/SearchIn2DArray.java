package com.arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr={
                {23,5,74,88},
                {11,56},
                {4},
                {99,107,23,19}
        };
//        int target=107;
//        int[] ans=search(arr,target); // format of return is {row,col}
//        System.out.println(Arrays.toString(ans));
//        System.out.println(max(arr));
        System.out.println(max2(arr));
    }
    static int[] search(int[][] arr,int target){
        if(arr.length==0){
            return new int[]{-1,-1};
        }
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col <arr[row].length ; col++) {
                if(arr[row][col]==target) {
                    return new int[]{row, col};
                }
            }

        }
        return new int[]{-1, -1};
    }
    static int max(int[][] arr){
        int max=Integer.MIN_VALUE;
        for (int row = 0; row < arr.length ; row++) {
            for (int col = 0; col <arr[row].length ; col++) {
                if(arr[row][col]>max){
                    max=arr[row][col];
                }
            }

        }

        return max;
    }
    static int max2(int[][] arr){  // using enhanced for loop
        int max=Integer.MIN_VALUE;
        for (int[] ints : arr) {
            for (int element : ints) {
                if(element>max){
                    max=element;
                }

            }

        }
        return max;
    }
}
