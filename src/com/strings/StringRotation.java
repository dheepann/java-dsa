package com.strings;
//String Rotation
//Check whether one string is a rotation of another.
//String s1 = "ABCD";
//String s2 = "CDAB";
//Expected: true

public class StringRotation {
    public static void main(String[] args) {
        String str = "ABCD";
        String str2 = "ADCB";
        System.out.println(isRotation(str, str2));
    }

    private static boolean isRotation(String str, String str2) {
        if (str.length() != str2.length()) return false;

        return (str + str).contains(str2);
    }

}
