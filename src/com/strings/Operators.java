package com.strings;

import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a' + 'n'); //converts the char into ascii values and print the result in number
        System.out.println("a" + "b"); //concatenates the string ie prints ab
        System.out.println('a' + 3); //prints 100
        System.out.println((char) ('a' + 3)); //converts 100 into character ie prints d

        System.out.println("a" + 1); //prints a1. integer will be converted to Integer that will call toString()
        //this is same as "a"+"1"

        System.out.println("Dheepan" + new ArrayList<>());
        System.out.println("Dheepan" + new Integer(56)); //prints Dheepan56 as this one also calls the toString() method

        System.out.println(new Integer(56) + 56); //=112
//        System.out.println(new Integer(56) + new ArrayList<>()); //gives error because the + operator works only with primitive type and atleast one of the object is string type
        System.out.println(new Integer(56) + "" + new ArrayList<>()); //prints 56[]
        System.out.println("a" + 'b'); //prints ab because if one of the obj is string the output will also be string

    }
}
