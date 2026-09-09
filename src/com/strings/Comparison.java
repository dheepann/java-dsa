package com.strings;

public class Comparison {
    public static void main(String[] args) {
        String a = "Kunal";
        String b = "Kunal";
        String c = a; // all the reference variables: a,b and c will point to "java". seperate object will not be created
        System.out.println(c == a); // == operator compares whether both refernce variables are pointing to the same content i.e., java

        System.out.println(a == b);

        String name1 = new String("Kunal"); // creates new string object where name1 points to it.
        String name2 = new String("Kunal");

        System.out.println(name1 == name2); // as both name1 and name2 points at different objects it will produce false

        System.out.println(name1.equals(name2)); // .eqauals() methods compares the content inside both the ref variables.
    }
}
