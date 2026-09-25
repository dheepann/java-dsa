package com.strings;

public class AnagramChecker {
    public static void main(String[] args) {
        String s1 = "anagram";
        String s2 = "nagarah";
        System.out.println(isanagram(s1, s2));
    }

    private static boolean isanagram(String s1, String s2) {
        int[] freq = new int[26];

        if (s1.length() != s2.length()) return false;

        // count each character in s1
        for (char ch : s1.toCharArray()) {
            freq[ch - 'a']++;
        }

        // decrement the character count in s2
        for (char ch : s2.toCharArray()) {
            freq[ch - 'a']--;
        }

        for (int count : freq) {
            if (count > 0) {
                return false;
            }
        }
        return true;
    }
}
