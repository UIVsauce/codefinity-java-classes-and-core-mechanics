package com.example;

// import Arrays library here
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        char[] unsortedArray = {'y', 'e', 'e', 'p', 'w', 'c', '>', '3'};
        // sort the array and print it to the console
        Arrays.sort(unsortedArray);
        for (char element : unsortedArray) {
            System.out.print(element + " ");
        }
    }
}