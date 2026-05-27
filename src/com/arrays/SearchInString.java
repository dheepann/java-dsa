package com.arrays;

public class SearchInString {
    public static void main(String[] args) {
        String name = "Dheepan";
        char target = 'p';
        boolean ans = search1(name, target);
//        boolean ans=search2(name,target);
        System.out.println(ans);
    }

    static boolean search2(String str, char target) {
        if (str.length() == 0) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)) { //charAt(i) gets one character at a specific index
                return true;
            }

        }
        return false;
    }

    static boolean search1(String name, char target) {
        if (name.length() == 0) {
            return false;
        }
        for (char ch : name.toCharArray()) { //toCharArray() converts the entire string to character array
            if (ch == target) {
                return true;
            }

        }
        return false;
    }

}
