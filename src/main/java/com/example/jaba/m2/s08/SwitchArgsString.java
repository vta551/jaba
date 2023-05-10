/*
 * Introduction to Java base concepts
 * 
 * https://github.com/egalli64/jaba
 */
package com.example.jaba.m2.s08;

/**
 * Control flow - Decision: switch on String
 */
public class SwitchArgsString {
    /**
     * Accordingly to the argument, a different feedback is generated
     * 
     * @param args a single argument is expected
     */
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please, pass me a string!");
            return;
        }

        switch (args[0]) {
        case "ciao":
            System.out.println("Hello to you!");
            break;
        case "Tom":
            System.out.println("Welcome back, Tom!");
            break;
        default:
            System.out.println("I don't understand");
            break;
        }

        System.out.println("Bye");
    }
}
