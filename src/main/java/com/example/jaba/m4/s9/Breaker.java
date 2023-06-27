/*
 * Introduction to Java base concepts
 * 
 * https://github.com/egalli64/jaba
 */
package com.example.jaba.m4.s9;

/**
 * Control flow - Loop: break
 */
public class Breaker {
    /**
     * Break a loop. If the target name is found among the guests, a message is
     * printed and the loop is interrupted
     * 
     * @param args the user could pass a name to be searched in the guest list
     */
    public static void main(String[] args) {
        // target is Bob, or whatever the user passes in
        String target = args.length == 0 ? "Bob" : args[0];

        String[] guests = { "Tom", "Bob", "Kim", "Zoe", "Al", "Pete" };

        for (String guest : guests) {
            if (guest.equals(target)) {
                System.out.println(target + " found among guests!");
                break;
            }
        }

        System.out.println("Done");
    }
}
