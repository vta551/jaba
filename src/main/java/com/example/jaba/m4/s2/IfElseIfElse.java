/*
 * Introduction to Java base concepts
 * 
 * https://github.com/egalli64/jaba
 */
package com.example.jaba.m4.s2;

/**
 * Control flow - Decision: if, else if, else
 */
public class IfElseIfElse {
    /**
     * One among three different blocks is executed
     * 
     * @param args different print, accordingly to args length
     */
    public static void main(String[] args) {

        // exactly one of these three blocks is going to be executed
        if (args.length == 0) {
            System.out.println("You didn't pass me any argument!");
        } else if (args.length == 1) {
            System.out.println("You passed me one argument");
        } else {
            System.out.println("You passed me two arguments or more");
        }

        // always executed
        System.out.println("Bye");
    }
}
