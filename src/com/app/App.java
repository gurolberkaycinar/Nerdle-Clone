package com.app;

import com.gui.*;

import javax.swing.*;

public class App {
        public static Window gameWindow;
    public static void main(String[] args) {
        gameWindow = new Window();
        gameWindow.setResizable(false);
        gameWindow.setLocationRelativeTo(null);
        gameWindow.setVisible(true);
        gameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gameWindow.changePanel("mainMenu");
        gameWindow.pack();
    }


}
