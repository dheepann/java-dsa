package com.strings;

import java.util.Arrays;

public class SortAString {
    public static void main(String[] args) {
        String str = "cabfed";

        //convert string to cahr array so that it's mutable
        char[] chars = str.toCharArray();

        //sort the character array
        Arrays.sort(chars);

        String sortedString = new String(chars);
        System.out.println(sortedString);
    }
}
