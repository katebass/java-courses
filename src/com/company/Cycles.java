package com.company;

import java.util.Scanner;

/*
    Module 1
    Copyright --- Kateryna Basova KNHUE
*/

public class Cycles {
    public static void main(String[] args) {
        // task 1
        String word = "mama";
        char symbol = '@';
        int floor = 10;
        long trials = 999999L;
        short flats = 5;
        byte catsNumber = 2;
        float bones = 4.9f;
        double drops = 30000.1;
        boolean leftHanded = true;

        System.out.println("My first word was " + word);
        System.out.println("My favorite symbol:" + symbol);
        System.out.println("I have " + catsNumber + " cats");
        System.out.println("I tried to wake up early for " + trials + " times");
        System.out.println("I moved to different flats " + flats + " times");
        System.out.println("I live on a " + floor + "th floor");
        System.out.println("Every day I drink about " + drops + " water drops");
        System.out.println("My body is " + bones + "% bones");
        System.out.println("I am a " + (leftHanded ? "left" : "right") +  "-handed");

        // task 2
        Scanner sc = new Scanner(System.in);
        System.out.println("Write your text to check if it's a palindrome: ");
        String text = sc.nextLine();
        text = text.replaceAll("\\W+", "").toLowerCase(); // remove all non-alphanumeric characters

        StringBuilder textToCheck = new StringBuilder(text);
        boolean palindrome = textToCheck.toString().equals(textToCheck.reverse().toString());
        System.out.println(palindrome);
        System.out.println("Your text " + (palindrome ? "is": "is not") + " a palindrome");

        // task 3
        double PI = 3.14;
        double y = 0.1f;
        double dx = 0.1;
        double area = 0.0;

        for (double x = 0; x < PI; x += dx)
        {
            if (Math.sin(x) <= y) {
                area += Math.sin(x) * dx;
            } else {
                area += y * dx;
            }
        }

        System.out.println("The area = " + area);

    }
}
