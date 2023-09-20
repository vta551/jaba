/*
 * Introduction to Java base concepts
 * 
 * https://github.com/egalli64/jaba
 */
package com.example.jaba.m4.s8;

/**
 * Exercises on for loop
 */
public class Exercises {
    public static void main(String[] args) {
        int x = 64;

        System.out.println("The initial value is " + x);

        // TODO: (a1) assign x to the loop variable, loop to print it until it is even,
        // divide it by 2 each time

        // TODO: (a2) assign x to the loop variable, loop to print it until it's half
        // value is even (divide it by 2 each time _before_ looping)

        // TODO: (b) Calculate and print the sum of the values in [1..x]
        System.out.println("Gauss summation formula: " + (x * (x + 1) / 2));
    }
}
