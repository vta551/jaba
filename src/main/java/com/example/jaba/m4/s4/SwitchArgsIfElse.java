/*
 * Introduction to Java base concepts
 * 
 * https://github.com/egalli64/jaba
 */
package com.example.jaba.m4.s4;

/**
 * Control flow - Decision: if else if ... else
 * 
 * @see SwitchArgs same behavior, there with switch, here with if-else
 */
public class SwitchArgsIfElse {
    /**
     * Accordingly to the number of arguments, a different case in the switch is
     * executed.
     * 
     * @param args determine the switch execution
     */
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No argument passed in");
        } else if (args.length == 1) {
            System.out.println("The only argument passed is: " + args[0]);
        } else if (args.length == 2) {
            System.out.println("The two args are: " + args[0] + ", " + args[1]);
        } else {
            System.out.println("The last argument passed is: " + args[args.length - 1]);
        }

        System.out.println("-- done --");
    }
}
