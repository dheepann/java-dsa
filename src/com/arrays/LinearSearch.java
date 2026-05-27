package com.arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {11,22,35,46,51,-6,7,8,29,-10};
        int target=-3;
        boolean ans=linearsearch2(arr,target);
        System.out.println(ans);

    }
    // search the target and return the index
//   static int search(int[] arr,int target){
//         if(arr.length==0){
//             return -1;
//
//         }
//         for(int index=0;index<arr.length;index++){
//            if(arr[index]==target){
//                return index;
//            }
//         }
//         return -1;
    // search the element and return true or false
    static boolean linearsearch2(int[] arr,int target){
        if(arr.length==0){
            return false;

        }
        for(int index=0;index<arr.length;index++){
            if(arr[index]==target){
                return true;
            }
        }
        return false;


    }
}
