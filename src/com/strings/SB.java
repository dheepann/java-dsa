package com.strings;

public class SB {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            builder.append(ch);
        }
        System.out.println(builder.toString());
        // or simply System.out.println(builder);

        builder.deleteCharAt(0); //deletes 'a'
        System.out.println(builder);

        builder.reverse(); //prints z to a
        System.out.println(builder);

        // program to reverse a string with in-built method
        String str = "Hello Dheepan";
        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println(reversed);

        // program to reverse a string without in-built method
        String s = "Hello Dheepan";
        String reversed2 = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            reversed2 += s.charAt(i); // avaoid this approach because it creates a new string object everytime
        }
        System.out.println(reversed2);

        // reverse a string using string builder
        String s2 = "Hello Dheepan";
        StringBuilder reversed3 = new StringBuilder();
        for (int i = s2.length() - 1; i >= 0; i--) {
            reversed3.append(s2.charAt(i));
        }
        System.out.println(reversed3.toString());
    }
}
