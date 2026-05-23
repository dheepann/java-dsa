package com;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter temperature in celcius: ");
        float C = input.nextFloat();
        float F = ((C * 9 / 5) + 32);
        System.out.println(C+ "degree celcius is "+F+ "Faranheit");

    }

}

