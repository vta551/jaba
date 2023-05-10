/*
 * Introduction to Java base concepts
 * 
 * https://github.com/egalli64/jaba
 */
package com.example.jaba.m2.s08;

/**
 * Control flow - Decision: switch and enumerator
 */
public class SwitchLight {
    /**
     * Generate randomly a TrafficLight, then use it to print a message
     * 
     * @param args not used
     * @see TrafficLight enumerator for available traffic lights
     */
    public static void main(String[] args) {
        TrafficLight light = SwitchLight.aColor();

        switch (light) {
        case GREEN:
            System.out.println("You can go");
            break;
        case YELLOW:
            System.out.println("Stop, if you can");
            break;
        case RED:
            System.out.println("Stop!");
            break;
        }
        System.out.println("Done!");
    }

    /**
     * Get randomly a traffic light
     * 
     * @return GREEN (.50), YELLOW (.25), RED (.25)
     */
    private static TrafficLight aColor() {
        return Math.random() > .5 ? TrafficLight.GREEN : //
                Math.random() > .5 ? TrafficLight.YELLOW : TrafficLight.RED;

    }
}