package com.company;

import java.awt.BorderLayout;
import javax.swing.JFrame;

public class Main {

    public static void main(String[] args) {

        //Frame Instantiation
        JFrame myFrame = new JFrame("EECS3311: Shape Sorting");

        //Adding Panels to Frame
        myFrame.add(ShapePanel.getInstance());
        myFrame.add(MyPanel.getInstance(), BorderLayout.NORTH);

        //Frame Settings
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setSize(600, 600);
        myFrame.setResizable(false);
        myFrame.setLocationRelativeTo(null);
        myFrame.setVisible(true);
    }
}