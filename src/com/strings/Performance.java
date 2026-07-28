package com.strings;

public class Performance {
    public static void main(String[] args) {
        String series = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
//            System.out.println(ch); //prints a to z

            series = series + ch;
        }
        System.out.println(series);
    }
}
