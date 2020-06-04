package com.company;

/*
    Module 1
    Copyright --- Kateryna Basova KNHUE
*/

public class Cycles {
    public static void main(String[] args) {
        // task 1. Write personal facts using primitive data types
        String word = "mama";
        char symbol = '@';
        int floor = 10;
        long trials = 9999999999L;
        short flats = 5;
        byte catsNumber = 2;
        float bones = 4.9f;
        double drops = 30000.1;
        boolean leftHanded = true;

        String text = "My first word was " + word + "\n" // 22
                    + "My favorite symbol: " + symbol + "\n" // 20
                    + "I have " + catsNumber + " cats" + "\n" // 13
                    + "I tried to wake up early for " + trials + " times" + "\n" // 41
                    + "I moved to different flats " + flats + " times" + "\n" // 34
                    + "I live on a " + floor + "th floor" + "\n" // 22
                    + "Every day I drink about " + drops + " water drops" + "\n" // 43
                    + "My body consists of " + bones + "% bones" + "\n" // 31
                    + "I am a " + (leftHanded ? "left" : "right") +  "-handed"; // 18

        System.out.println(text);
        System.out.println("Number of characters in the text: " + text.length() + "\n"); // should be 256

        // task 2. Check if sentence is a palindrome
        String[] sentencesToCheck = new String[5];
        // prepare different sentences for check
        sentencesToCheck[0] = "Was it a car or a cat I saw?"; // yes
        sentencesToCheck[1] = "Mr. Owl ate my metal worm"; // yes
        sentencesToCheck[2] = "Do geese see God?"; // yes
        sentencesToCheck[3] = "It should not be a palindrome"; // no
        sentencesToCheck[4] = "It's definitely not"; // no

        // check each sentence if it's a palindrome
        for (String sentence : sentencesToCheck) {
            // remove non-alphanumeric characters + make sentence lowercase
            sentence = sentence.replaceAll("\\W+", "").toLowerCase();

            StringBuilder textToCheck = new StringBuilder(sentence);
            // compare sentence with itself reversed. If they match - sentence is a palindrome
            boolean isPalindrome = textToCheck.toString().equals(textToCheck.reverse().toString());
            System.out.println("Your sentence " + (isPalindrome ? "is" : "is not") + " a palindrome");
        }
        // task 3 Get the area limited by the following functions   x = 0 .. 3.14;    y = sin(x);   y = 0.1
        double PI = Math.PI;
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
