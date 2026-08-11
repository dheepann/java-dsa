package com.strings;

import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String name = "Dheepan hello world";
        System.out.println(name.toString());
        System.out.println(name); // same as above
        System.out.println(Arrays.toString(name.toCharArray())); //check output
        System.out.println(name.toLowerCase()); //prints dheepan hello world
        System.out.println(name.indexOf('a'));


        System.out.println("   Dheepan   ".strip()); //removes blank spaces
        System.out.println(Arrays.toString(name.split(" "))); // prints [Dheepan, hello, world]


    }
}
