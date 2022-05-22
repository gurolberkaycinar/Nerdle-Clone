package com.gui;

import javax.swing.*;
import com.gui.*;

import static com.app.App.gameWindow;

public class Window extends JFrame {
    private JPanel mainMenu;
    private JPanel game;
    private JPanel stats;

    public Window() {
        super("Nerdle");
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
    }

    public void changeScreen(int x) {
        if(x == 1) {
            this.setContentPane(mainMenu);
        }
        /*else if(x == 2) {
            this.setContentPane(game);
        }*/ else {
            this.setContentPane(stats);
        }
    }

    private void createUIComponents() {
        mainMenu = new MainMenu().getPanel();

        //game = new Game().getPanel();
        stats = new Stats().getPanel();
    }

    public JPanel getMainMenu() {
        return mainMenu;
    }

    public JPanel getGame() {
        return game;
    }

    public JPanel getStats() {
        return stats;
    }
}
