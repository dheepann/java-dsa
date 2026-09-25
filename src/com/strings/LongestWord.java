package com.strings;

public class LongestWord {
    public static void main(String[] args) {
        String str = "Java is a secure and powerful programming language";
        System.out.println(longestWord(str));
    }

    private static String longestWord(String str) {
        String word = "", longest = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != ' ') {
                word += ch;
            } else {
                if (word.length() > longest.length()) {
                    longest = word;
                }
                word = "";
            }

            // since the last word do not have a space after it we have to check for it seperately
            // else the last word will never be compared to its prev word
            if (word.length() > longest.length()) {
                longest = word;
            }

        }
        return longest;
    }
}
