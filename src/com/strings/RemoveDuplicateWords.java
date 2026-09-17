package com.strings;

public class RemoveDuplicateWords {
    public static void main(String[] args) {
        String sentence = "Java spring java Angular spring java";
        removeDuplicates(sentence);
    }

    private static void removeDuplicates(String str) {
        String sentence = "java spring java angular spring java";

        String[] words = sentence.split(" ");

        StringBuilder result = new StringBuilder();

        for (String word : words) {

            boolean duplicate = false;

            String[] resultWords = result.toString().split(" ");

            for (String existingWord : resultWords) {

                if (existingWord.equalsIgnoreCase(word)) {
                    duplicate = true;
                    break;
                }
            }

            if (!duplicate) {

                if (result.length() > 0) {
                    result.append(" ");
                }

                result.append(word);
            }
        }

        System.out.println(result);

    }
}
