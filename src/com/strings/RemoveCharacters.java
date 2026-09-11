package com.strings;

public class RemoveCharacters {
    public static void main(String[] args) {
        String str = "Dheepan";
        char target = 'e';

        //removing character using inbuilt java methods:
        String resultWithInbuilt = str.replace(String.valueOf(target), ""); // String.valueOf() converts values like numbers or booleans into a readable string format.
        // String.valueOf() can be applied to all primitive (int, boolean, etc.) as well as char[] unlike obj.toString() method which cannot be directly called on primitive types.

        System.out.println("After removing " + target + "(using inbuilt method): " + resultWithInbuilt);

        //removing character without using inbuilt methods and using StringBuilder
        StringBuilder resultWithoutInbuilt = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != target) {
                resultWithoutInbuilt.append(str.charAt(i));
            }
        }
        System.out.println("After removing " + target + "(without using inbuilt): " + resultWithoutInbuilt);
    }

}
