package com.arrays;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr={-3,-45,0,45,89,2,45,12};
        int target=0;
        int ans=linearsearch(arr,target,2,7);
        System.out.println(ans);
    }
    static int linearsearch(int[] arr,int target,int start,int end){
        if(arr.length==0){
            return -1;
        }
        for(int i=start;i<=end;i++){
            int element=arr[i];
            if(element==target){
                return i;
            }
        }
        return -1; // this line will execute when none of the above return statements have executed
        // hence target not found
    }
}
