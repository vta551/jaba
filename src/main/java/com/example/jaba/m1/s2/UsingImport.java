/*
 * Introduction to Java base concepts
 * 
 * https://github.com/egalli64/jaba
 */
package com.example.jaba.m1.s2;

import com.example.jaba.m1.s5.Variable;
import com.example.jaba.m1.s6.*;

/**
 * A package-private class, it could be seen only from the current package
 */
class UsingImport {
    /**
     * Print the name of:
     * 
     * <li>The current class
     * <li>Another class in the same package (does not require import)
     * <li>A class in another package - imported explicitly
     * <li>A class in another package - imported implicitly with all its package
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        System.out.println(UsingImport.class);
        System.out.println(AnotherPackageClass.class);
        System.out.println(Variable.class);
        System.out.println(Primitive.class);
    }
}

/**
 * Another package-private class
 * <p>
 * Having more than one top-level class in a single file is not common and
 * rarely a good idea
 */
class AnotherPackageClass {
    // TODO: Not implemented (yet)
}
