/*
 * Introduction to Java base concepts
 * 
 * https://github.com/egalli64/jaba
 */
package com.example.jaba.m4.s4;

/**
 * Control flow - Decision: switch
 */
public class SwitchArgs {
    /**
     * Accordingly to the number of arguments, a different case in the switch is
     * executed.
     * 
     * @param args determine the switch execution
     */
    public static void main(String[] args) {
        switch (args.length) {
        case 0:
            System.out.println("No argument passed in");
            break;
        case 1:
            System.out.println("The only argument passed is: " + args[0]);
            break;
        case 2:
            System.out.println("The two args are: " + args[0] + ", " + args[1]);
            break;
        default:
            System.out.println("The last argument passed is: " + args[args.length - 1]);
            break;
        }
        System.out.println("-- done --");
    }
}
