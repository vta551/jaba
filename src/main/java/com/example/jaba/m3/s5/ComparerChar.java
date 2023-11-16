/*
 * Introduction to Java base concepts
 * 
 * https://github.com/egalli64/jaba
 */
package com.example.jaba.m3.s5;

/**
 * Comparison operators on char
 */
public class ComparerChar {
    /**
     * Some details on comparing characters
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        // letters are coded in the expected order
        System.out.print("Is 'c' < 'k' (yes): ");
        System.out.println('c' < 'k');

        // all uppercase letters are before all lowercase letters
        System.out.print("Is 'Z' < 'a' (yes): ");
        System.out.println('Z' < 'a');

        // ciphers are coded in the expected order
        System.out.print("Is '0' < '9' (yes): ");
        System.out.println('0' < '9');
        
        // ciphers are before letters
        System.out.print("Is '0' (zero) < 'O' (upper 'o') (yes): ");
        System.out.println('0' < 'O');

        // beware of characters that look similar!
        System.out.print("Is 'ì' == 'i' (no): ");
        System.out.println('ì' == 'i');
    }
}
