package com.strings;
// string compression
// Read → Count → Append → Reset

public class StringCompression {
    public static void main(String[] args) {
        String str = "abbccc";
        char[] chArr = str.toCharArray();
        System.out.println(stringCompression(chArr));
    }

    public static String stringCompression(char[] chars) {

        StringBuilder result = new StringBuilder();

        int count = 1;

        for (int i = 0; i < chars.length; i++) {

            if (i + 1 < chars.length && chars[i] == chars[i + 1]) {
                count++;
            } else {

                result.append(chars[i]);

                if (count > 1) {
                    result.append(count);
                }

                count = 1;
            }
        }

        return result.toString();
    }


}
