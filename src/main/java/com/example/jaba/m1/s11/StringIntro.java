/*
 * Introduction to Java base concepts
 * 
 * https://github.com/egalli64/jaba
 */
package com.example.jaba.m1.s11;

/**
 * Introduction to String, StringBuilder, text block
 */
public class StringIntro {
    public static void main(String[] args) {
        // a single character
        char c = 'x';
        System.out.println(c);

        /*-
         * Create a String explicitly, !!! _not_ a good idea !!!
         * Two object (max) are created:
         *  one for the literal (when required) in the string pool
         *  one referenced by s
         */
        String s = new String("Hello");
        System.out.println(s);

        /*-
         * Implicit call to "new" for a String 
         * One object is created in the string pool (when required)
         */
        String t = "Hello";
        System.out.println(t);

        // Create a mutable string, and then change it
        StringBuilder sb = new StringBuilder("Hello");
        sb.deleteCharAt(4);
        sb.append(", Tom!");

        // Create a String from a StringBuilder
        String v = sb.toString();
        System.out.println(v);
        System.out.println("---");

        // Text block
        String modern = """
                Non impedir lo suo fatale andare:
                vuolsi così colà dove si puote
                ciò che si vuole, e più non dimandare""";

        // Classic string with newlines in it
        String classic = "Non impedir lo suo fatale andare:\n" + //
                "vuolsi così colà dove si puote\n" + //
                "ciò che si vuole, e più non dimandare";

        System.out.println(modern);
        System.out.println("---");
        System.out.println(classic);
    }
}
