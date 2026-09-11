package com.strings;

import java.util.Arrays;

public class SortAString {
    public static void main(String[] args) {
        String str = "cabfed";

        //convert string to char array so that it's mutable
        char[] chars = str.toCharArray();

        //sort the character array
        Arrays.sort(chars);
        
        // convert the character array to string in order to print as string
        String sortedString = new String(chars);
        System.out.println(sortedString);
    }
}
