package com.arrays;

public class EvenDigits {
    static void main(String[] args) {
        int[] nums = {12, 345, 22, 6, 7896};
//        int ans = evenDigits(nums);
        int soln = findNumbers(nums);
        System.out.println(soln);
    }


    //    static int evenDigits(int[] nums) { // My version of this leetcode problem
//        int c=0;
//        for (int num : nums) {
//            int count=0;
//            while(num>0) {
//                count++;
//                num/=10;
//
//            }
//            if(count%2==0){
//                c++;
//            }
//
//        }
//        return c;
//
//
//
//    }
    // kunal's verion of solution: normal vs optimized approaches
    //we use 3 different methods to perform different actions: more efficient way of writing a program
    static int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (isEven(num)) {
                count++;

            }
        }
        return count;

    }


    static boolean isEven(int num) {
        int numberOfDigits = digits(num);

        /*if (num % 2 == 0)
                  return true;
          }
          else{
              return false;
    } */
        return numberOfDigits % 2 == 0;
    }

    static int digits(int num) {
        if (num < 0) {
            num = num * -1; // if the given number is negative make it positive by multiplying with -1
        }
        if (num == 0) {
            return 1;
        }
        return (int) (Math.log10(num) + 1); //optimized approach: lesser runtime and lesser memory
    }
}
