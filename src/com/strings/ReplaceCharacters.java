package com.strings;
//Replace Multiple Characters
//Replace a→@, e→3, i→1 and o→0 without using replace().
//String text = "Java Programming Language";
//Expected: J@v@ Pr0gr@mm1ng L@ngu@g3

public class ReplaceCharacters {
    public static void main(String[] args) {
        String str = "Java Programming Language";
        StringBuilder res = new StringBuilder();
        for (char ch : str.toCharArray()) {
            char newChar = switch (ch) {
                case 'a' -> '@';
                case 'e' -> '3';
                case 'i' -> '1';
                case 'o' -> '0';
                default -> ch;
            };
            res.append(newChar);
        }
        System.out.println(res);
    }
}
