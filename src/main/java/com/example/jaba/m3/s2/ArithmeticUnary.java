/*
 * Introduction to Java base concepts
 * 
 * https://github.com/egalli64/jaba
 */
package com.example.jaba.m3.s2;

/**
 * Arithmetic unary operators
 */
public class ArithmeticUnary {
    /**
     * Using unary operators on a variable
     * <li>++ to increase by one
     * <li>-- to decrease by one
     * <li>+ pretty useless
     * <li>- change sign
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        int value = 1;

        int result = value;
        System.out.print("result = value: ");
        System.out.print("value is ");
        System.out.print(value);
        System.out.print(", result is ");
        System.out.println(result);

        result = ++value;
        // same as:
//      value = value + 1;
//      result = value;
        System.out.print("result = ++value: ");
        System.out.print("value is ");
        System.out.print(value);
        System.out.print(", result is ");
        System.out.println(result);

        result = --value;
        System.out.print("result = --value: ");
        System.out.print("value is ");
        System.out.print(value);
        System.out.print(", result is ");
        System.out.println(result);

        result = value++;
        // same as:
//      result = value;
//      value = value + 1;
        System.out.print("result = value++: ");
        System.out.print("value is ");
        System.out.print(value);
        System.out.print(", result is ");
        System.out.println(result);

        result = value--;
        System.out.print("result = value--: ");
        System.out.print("value is ");
        System.out.print(value);
        System.out.print(", result is ");
        System.out.println(result);

        result = +value;
        System.out.print("result = +value: ");
        System.out.print("value is ");
        System.out.print(value);
        System.out.print(", result is ");
        System.out.println(result);

        result = -value;
        System.out.print("result = -value: ");
        System.out.print("value is ");
        System.out.print(value);
        System.out.print(", result is ");
        System.out.println(result);
    }
}
