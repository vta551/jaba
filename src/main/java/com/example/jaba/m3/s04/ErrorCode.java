/*
 * Introduction to Java base concepts
 * 
 * https://github.com/egalli64/jaba
 */
package com.example.jaba.m3.s04;

/**
 * Bad arguments - signaled by error code
 */
public class ErrorCode {
    /**
     * When calling Math::sqrt() we should remember to check the returned value (if
     * we are not dead sure about the argument). Otherwise we could have an
     * unexpected NaN in a variable.
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        // a bad argument
        double argument = -1.0;
        double radix = Math.sqrt(argument);

        // We should not use the returned value without checking it!
        System.out.println("Square root is " + radix);

        // Check the return value before using it!
        if (Double.isNaN(radix)) {
            System.out.println("Can't calculate the square root of " + argument);
        } else {
            System.out.println("Square root is " + radix);
        }
    }
}
