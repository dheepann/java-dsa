package com.strings;
//Reverse the order of words while keeping each word intact. Then create a second solution without using split().
// String input = "Java Programming Language";
//Expected: Language Programming Java

public class ReverseWordOrder {
    public static void main(String[] args) {
        String str = "Java Full Stack development";
        reverseWord(str); // using .split() method
    }

    static void reverseWord(String str) {
        String[] words = str.split(" ");
        StringBuilder res = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            if (res.length() > 0) res.append(" ");
            res.append(words[i]);
        }
        System.out.println(res);
    }
}
