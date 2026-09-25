package com.strings;

import java.util.HashMap;

public class FirstNonRepeatedCharacter {
    public static void main(String[] args) {
        String str = "swiss";
        System.out.println(nonRepeated(str)); // using hashmap
        System.out.println(nonRepeated2(str)); // without hashmap
    }

    static char nonRepeated2(String str) {
        int[] count = new int[26];

        // step 1: count each character
        for (char ch : str.toCharArray()) {
            count[ch - 'a']++;
        }

        // step 2: find the first character whose count == 1
        for (char ch : str.toCharArray()) {
            if (count[ch - 'a'] == 1) {
                return ch;
            }
        }
        return '0';
    }

    static char nonRepeated(String str) {
        HashMap<Character, Integer> map = new HashMap<>();

        // step 1: count each character
        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // step 2: find the first character with count == 1
        char ans = ' ';
        for (char ch : str.toCharArray()) {
            if (map.get(ch) == 1) {
                ans = ch;
                break;
            }
        }
        return ans;

    }
}
