package com.strings;

public class RemoveDuplicateWords {
    public static void main(String[] args) {
        String sentence = "Java spring java Angular spring java";
        removeDuplicates(sentence); // without using HashSet
    }

    static void removeDuplicates(String sentence) {
        String[] words = sentence.split(" "); // first we create an array of string using .split() method
        StringBuilder res = new StringBuilder(); // we add in the result sb only after removing duplicates using below logic

        for (String word : words) {
            boolean duplicate = false;

            String[] resultWords = res.toString().split(" "); // we convert the res sb to string array resultWords in order to compare with the original String[] words.
            //  if a word present in original string words is already in res we declare duplicate is present and we break and we contiue the loop to the next word in the string array

            for (String existingWord : resultWords) {
                if (existingWord.equalsIgnoreCase(word)) {
                    duplicate = true;
                    break;
                }
            }

            if (!duplicate) {
                if (sentence.length() > 0) res.append(" "); // if a word is already added i add space for the next word
                res.append(word);
            }

        }
        System.out.println(res);
    }
}
