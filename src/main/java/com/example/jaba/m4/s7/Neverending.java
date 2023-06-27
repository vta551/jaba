/*
 * Introduction to Java base concepts
 * 
 * https://github.com/egalli64/jaba
 */
package com.example.jaba.m4.s7;

/**
 * Control flow - Infinite Loop (while)
 */
public class Neverending {
    /**
     * Print a dot, sleep for a second, repeat forever (or until someone kill the
     * process).
     * 
     * @param args not used
     * @throws InterruptedException when the OS kills the process
     */
    public static void main(String[] args) throws InterruptedException {
        while (true) {
            System.out.print('.');
            Thread.sleep(1_000);
        }
    }
}
