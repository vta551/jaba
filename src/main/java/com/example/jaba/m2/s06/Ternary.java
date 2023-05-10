/*
 * Introduction to Java base concepts
 * 
 * https://github.com/egalli64/jaba
 */
package com.example.jaba.m2.s06;

/**
 * Control flow - Decision the conditional expression ?:
 */
public class Ternary {
    /**
     * Example for ternary operator ?:
     * <p>
     * Compared against if-else / default value + if
     */
    public static void main(String[] args) {
        String version1 = args.length == 0 ? "No arg passed" : args[0];
        System.out.println(version1);

        // Not nice: split declaration from conditional initialization
        String version2;
        if (args.length == 0) {
            version2 = "No arg passed";
        } else {
            version2 = args[0];
        }
        System.out.println(version2);

        // Not nice: variable is defined, but sometimes immediately reassigned
        String version3 = "No arg passed";
        if (args.length != 0) {
            version3 = args[0];
        }
        System.out.println(version3);
    }
}
