/*
 * Introduction to Java base concepts
 * 
 * https://github.com/egalli64/jaba
 */
package com.example.jaba.m3.s3;

/**
 * Associativity and precedence
 */
public class Precedence {
    /**
     * Multiplicative operators have higher priority of additive ones
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        // multiply first
        System.out.println(2 + 6 * 7 - 3);
        // but parenthesis could change the game
        System.out.println((2 + 6) * (7 - 3));

        // TODO: fix the execution order
        double a = 1.0;
        double result = 1 / a + 1 / a + 1 / a + 1 / a;
        System.out.println("Actual result is: " + result);
        System.out.println("Expected result is: 0.6000000000000001");
    }
}
