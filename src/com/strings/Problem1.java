package com.strings;
// question: print no.of words, vowels and frequency of each character in a string, most repeated word, longest word and shortest word.

import java.util.HashMap;

public class Problem1 {
    public static void main(String[] args) {
        String str = "Dheepan Full Stack Developer";
        characterCount(str); // count characters in a string using HashMap
        System.out.println(wordCount(str));
        shortestAndLongest(str);
        System.out.println(vowelCount(str));
    }

    private static int vowelCount(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = Character.toLowerCase(str.charAt(i));
            if ("aeiou".indexOf(ch) != -1)
                count++; // .indexOf() method is highly flexible because it has multiple overloaded versions. To answer directly: It can accept both strings and characters, but how it checks them depends on what you pass into it.
        }
        return count;
    }

    static void shortestAndLongest(String str) {
        String[] words = str.split(" ");
        String shortest = words[0];
        String longest = words[0];
        for (String word : words) {
            if (word.length() < shortest.length()) shortest = word;
            if (word.length() > longest.length()) longest = word;
        }
        System.out.println("Shortest word: " + shortest);
        System.out.println("Longest word: " + longest);
    }

    static void characterCount(String str) {

        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        System.out.println(map);
    }

    static int wordCount(String str) {
        int count = 0;
        if (str.charAt(0) != ' ') count++; // we write this to include 1st word also

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == ' ' && str.charAt(i + 1) != ' ') { // if only this condition is present it only returns the no.of spaces
                count++;
            }
        }
        return count;
    }


}
