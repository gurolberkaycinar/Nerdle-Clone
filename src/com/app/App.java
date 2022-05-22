package com.app;

import com.gui.*;

public class App {
    public static Window gameWindow;

    public static void main(String[] args) {
        gameWindow = new Window();
        gameWindow.setResizable(false);
        gameWindow.changeScreen(1);
        gameWindow.pack();
        gameWindow.setLocationRelativeTo(null);
    }

    public static void changeScreen(int x) {
        if(x == 1) {
            gameWindow.setContentPane(gameWindow.getMainMenu());
        }
        /*else if(x == 2) {
            this.setContentPane(game);
        }*/ else {
            gameWindow.setContentPane(gameWindow.getStats());
        }
    }
}
