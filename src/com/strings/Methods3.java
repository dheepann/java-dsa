package com.strings;

import java.util.Arrays;


public class Methods3 {
    public static void main(String[] args) {
        // toString() vs Arrays.toString() use case:
        // Arrays.toString() is used when you have an array and want to see its elements.

        int[] numbers = {10, 20, 30};
        String name = "Dheepan";

        System.out.println(Arrays.toString(numbers)); // prints [10,20,30]
        System.out.println(numbers); // prints hash value: [I@5acf9800 because Java is printing the array object's representation rather than its contents.
        // System.out.println(Arrays.toString(name)); // This won't compile because Arrays.toString() expects an array, but name is a String.


        // If you want to use Arrays.toString(), first convert the String to a char[]:
        System.out.println(Arrays.toString(name.toCharArray()));

        // One important distinction: toString() is a method belonging to an object: name.toString()
        // Arrays.toString() is a static method belonging to the Arrays utility class: Arrays.toString(numbers)
        // That's why the syntax is different.
        // The same thing happens with a String[]:
        String[] arr2 = {"Dheepan", "Hello", "World"};

        System.out.println(arr2); // prints: [Ljava.lang.String;@5acf9800
        System.out.println(Arrays.toString(arr2)); // prints [Dheepan, Hello, World]

        // char[] vs Arrays.toString:


        char[] arr = {'D', 'h', 'e', 'e', 'p', 'a', 'n'};

        System.out.println(arr); // prints Dheepan because it writes the characters directly. how?
        // This is a very specific behavior of System.out.println() when the argument is char[].
        // System.out.println() is an overloaded method. It has different versions for different data types.
        // println(char[] x) This method is specifically designed to write the characters contained in the array. It effectively processes:
        //  arr[0] → D
        //  arr[1] → h
        //  arr[2] → e
        //  arr[3] → e
        //  arr[4] → p
        //  arr[5] → a
        //  arr[6] → n
        // and sends them one after another: D + h + e + e + p + a + n giving: Dheepan

        System.out.println(Arrays.toString(arr)); // prints [D,h,e,e,p,a,n]


    }
}
