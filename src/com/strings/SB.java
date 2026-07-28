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
    }
}
