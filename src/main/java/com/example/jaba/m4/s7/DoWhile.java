/*
 * Introduction to Java base concepts
 * 
 * https://github.com/egalli64/jaba
 */
package com.example.jaba.m4.s7;

/**
 * Control flow - Loop: do-while
 */
public class DoWhile {
    /**
     * Using do-while to loop on the args array. We need to check the array length
     * before looping to avoid troubles!
     * 
     * @param args each of its items are printed
     * @see While a more natural solution in this case
     */
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please, pass me arguments!");
        } else {
            int i = 0;
            do {
                System.out.println("arg " + i + " is " + args[i]);
                i += 1;
            } while (i < args.length);
        }

        System.out.println("Done");
    }
}
