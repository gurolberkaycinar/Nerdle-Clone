package com.gui;

import com.app.App;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static com.app.App.gameWindow;

public class Stats {
    private JPanel stats;
    private JLabel student;
    private JPanel allStats;
    private JButton exitButton;

    public Stats() {
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                App.changeScreen(1);
                gameWindow.pack();
                gameWindow.setLocationRelativeTo(null);
            }
        });
    }

    public JPanel getPanel() {
        return stats;
    }
}
