package com.strings;
//Most Frequent Character
//Find the character occurring most frequently. If multiple characters tie for the highest count, display all of them.
//String text = "programming";
//Expected: Most Frequent Character : r Count : 2

import java.util.HashMap;

public class FrequentCharacter {
    public static void main(String[] args) {
        String text = "programming"; // without using hashmap
        int[] freq = new int[26];
        int maxFreq = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            freq[ch - 'a']++; // count each character in string and store the count no. in array of size 26

            if (freq[ch - 'a'] > maxFreq)
                maxFreq = freq[ch - 'a']; // update maximum frequency of the character each time
        }
        for (int i = 0; i < 26; i++) {
            if (freq[i] == maxFreq) {
                System.out.println((char) (i + 'a') + " count: " + maxFreq);
            }
        }

        System.out.println(frequentCharacter(text)); // using hashmap

    }

    static char frequentCharacter(String text) {
        HashMap<Character, Integer> map = new HashMap<>();
        int count = 0;
        char ans = ' ';
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
            if (map.get(ch) > count) {
                ans = ch;
                count = map.get(ch);
            }
        }
        return ans;
    }
}
