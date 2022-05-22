package com.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.app.App;
import com.gui.Window;

import static com.app.App.gameWindow;

public class MainMenu extends JFrame {
    private JPanel mainMenu;
    private JLabel student;
    private JPanel title;
    private JPanel choices;
    private JButton newGameButton;
    private JButton continueButton;
    private JButton statsButton;
    private JButton exitButton;

    public MainMenu() {

        statsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                App.changeScreen(3);
                gameWindow.pack();
                gameWindow.setLocationRelativeTo(null);
            }
        });
    }

    public JPanel getPanel() {
        return mainMenu;
    }
}
