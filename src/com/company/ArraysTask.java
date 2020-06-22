package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

/*
    * @author Kateryna Basova KHNUE
    * @version 06 of June 2020

    Classname: ArraysTask

    Module 1 Task Array practice

    1. Find in the net and download a text version of a novel about Harry Potter.
    2. Split the novel into an array of words.
    3. Clean the words from punctuation signs.
    4. Create another array containing distinct words.
    5. Order the words in alphabetic order.
*/
public class ArraysTask {
    public static void main(String[] args) throws IOException {

        // 1. Get text from the file
        String text = new String(Files.readAllBytes(Paths.get("/home/kate/Documents/harry.txt")));
        // 2. Split the novel into an array of words
        String[] allWords = text
                .toLowerCase()
                // 3. Clean punctuation signs in words.
                .replaceAll("[\\s\\.\\?\\!,\\-\":;]+", " ")
                .split("\\s+");

        // 4. Create a String which will contain distinct words
        String uniqueWords = "";

        // Go through all words to define unique words
        for (String word : allWords) {
            if (!uniqueWords.contains(word)) {
                // add words to the String uniqueWords if it's a first occurrence
                uniqueWords += word + " ";
            }
        }

        // Convert string to array splitting it by spaces
        String[] uniqueWordsArray = uniqueWords.split(" ");
        // 5. Order the words in alphabetic order
        Arrays.sort(uniqueWordsArray);

        // Print result to the console
        System.out.println("Array of distinct words in alphabetic order: ");
        for (String word : uniqueWordsArray) {
            System.out.println(word);
        }


    }
}
