package com.strings;

public class Palindrome {
    public static void main(String[] args) {
        String str = "malayalam";
        System.out.println(isPalindrome(str));
        System.out.println(isPalindromeAlternate(str));
    }

    static boolean isPalindrome(String str) {
        if (str == null || str.length() == 0) {
            return true;
        }
        for (int i = 0; i < str.length(); i++) {
            char start = str.charAt(i);
            char end = str.charAt(str.length() - 1 - i);

            if (start != end) {
                return false;
            }
        }
        return true;
    }

    // alternate approach: reverse the string using StringBuilder and compare it with the original string.
    static boolean isPalindromeAlternate(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString().equals(str); // compares String contents
        // return reversed.equals(str) returns false because here it is doing StringBuilder.equals(String)
        // StringBuilder does not override equals() to compare the characters inside it.
        // Its equals() comes from object, which essentially checks whether two objects are the same objects, not whether their contents are the same.
        // thus it compares objects
    }
}
