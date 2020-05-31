package com.company;

/*
    Module 1
    Copyright --- Kateryna Basova KNHUE
*/

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class ArraysTask {
    public static void main(String[] args) throws IOException {

        // get text from the file
        String text = new String(Files.readAllBytes(Paths.get("/home/kate/Documents/harry.txt")));
        // Split the novel into an array of words
        String[] allWords = text
                .toLowerCase()
                .replaceAll("[\\s\\.\\?\\!,\\-\":;]+", " ")
                .split("\\s+");


        String uniqueWords = "";

        for (String word : allWords) {
            if (!uniqueWords.contains(word)) {
                uniqueWords += word + " "; // add words to uniqueWords if it's first occurrence
            }
        }

        String[] uniqueWordsArray = uniqueWords.split(" ");
        Arrays.sort(uniqueWordsArray);

        System.out.println("Array of distinct words in alphabetic order: ");
        for (String word : uniqueWordsArray) {
            System.out.println(word);
        }


    }
}
