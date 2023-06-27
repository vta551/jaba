/*
 * Introduction to Java base concepts
 * 
 * https://github.com/egalli64/jaba
 */
package com.example.jaba.m1.s4;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import static javax.swing.SwingUtilities.invokeLater;

/**
 * A friendlier "hello"
 */
public class Swingy {
    public static void main(String[] args) {
        String message = "Hello, " + (args.length == 0 ? "stranger" : args[0]);
        invokeLater(() -> {
            JFrame frame = new JFrame("Hello!");
            frame.setSize(400, 100);
            frame.setLocationRelativeTo(null);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JPanel panel = new JPanel();
            panel.add(new JLabel(message));
            frame.add(panel);
            frame.setVisible(true);
        });
    }
}
