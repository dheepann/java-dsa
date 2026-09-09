package com.strings;

public class Methods2 {
    public static void main(String[] args) {
        // toCharArray() method use case:
        String name = "Dheepan";

        System.out.println(name); // prints Dheepan
        System.out.println(name.toCharArray()); // also prints Dheepan but But toCharArray() is not used for printing. Its purpose is to convert a String into a char[] so you can work with individual characters as an array.


        // but why would you want char[]?
        String name2 = "Dheepan";
        char[] chars = name.toCharArray();
        // For example, you can access individual characters using an array index:
        System.out.println(chars[0]);
        System.out.println(chars[1]);
        System.out.println(chars[2]);


        // you can also modify the char[]
        String name3 = "Dheepan";
        char[] chars2 = name.toCharArray();
        chars[0] = 'X';
        System.out.println(chars); // prints Xheepan


        String myName = "Dheepan";

        // name[0] = 'X';   //  Not allowed


        // practical example: suppose you want to count how many 'e' characters are in a String:
        String name4 = "Dheepan";

        char[] chars3 = name4.toCharArray();

        int count = 0;

        for (char ch : chars3) {
            if (ch == 'e') {
                count++;
            }
        }

        System.out.println(count);


        // You could also do this without toCharArray():
        String name5 = "Dheepan";

        int count2 = 0;

        for (int i = 0; i < name5.length(); i++) {
            if (name5.charAt(i) == 'e') {
                count2++;
            }
        }

        System.out.println(count2);

        // important: So toCharArray() is not necessary every time you want to work with characters. It is useful when you specifically want the String's characters as a char[].
    }
}
