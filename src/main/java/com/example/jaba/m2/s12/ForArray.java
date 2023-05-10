/*
 * Introduction to Java base concepts
 * 
 * https://github.com/egalli64/jaba
 */
package com.example.jaba.m2.s12;

/**
 * Control flow - Loop: for (classic)
 */
public class ForArray {
    /**
     * Show for (classic) usage on an array. The loop variable represents the index.
     * Traditionally, right-open intervals are preferred.
     * 
     * @param args the array looped on
     */
    public static void main(String[] args) {
        System.out.println("Please, pass a few args");
        for (int i = 0; i < args.length; i++) {
            System.out.println("The argument " + i + " is " + args[i]);
        }

        System.out.println("done!");
    }
}
