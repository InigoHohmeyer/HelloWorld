package com.company;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main {
    private static void createAndShowGUI() {
        JFrame frame = new JFrame("TextEditor");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel emptyLabel = new JLabel("Hello World");
        emptyLabel.setPreferredSize(new Dimension(175,100));
        frame.getContentPane().add(emptyLabel, BorderLayout.NORTH);
        JTextField textField = new JTextField();
        frame.add(textField);


        frame.pack();
        frame.setVisible(true);}

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                createAndShowGUI();
        }


    });


    }
}
