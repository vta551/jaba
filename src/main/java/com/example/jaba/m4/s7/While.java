/*
 * Introduction to Java base concepts
 * 
 * https://github.com/egalli64/jaba
 */
package com.example.jaba.m4.s7;

/**
 * Control flow - Loop: while
 */
public class While {
    /**
     * Using while to loop on the args array. If args is empty, the while block is
     * (correctly) never executed.
     * 
     * @param args each of its items are printed
     */
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please, pass me arguments!");
        }

        int i = 0;
        while (i < args.length) {
            System.out.println("The argument " + i + " is " + args[i]);
            i++;
        }

        System.out.println("done, looped " + i + " times");
    }
}