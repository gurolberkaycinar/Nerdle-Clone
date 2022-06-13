/*
 * Created by JFormDesigner on Fri May 27 22:48:48 TRT 2022
 */

package com.gui;

import javax.swing.*;
import javax.swing.GroupLayout;

import static com.app.App.saveFile;

/**
 * @author unknown
 */
public class Window extends JFrame {
    JPanel mainMenu;
    JPanel testScreen;
    JPanel gameScreen;
    public Window() {
        initComponents();
        mainMenu = new MainMenu().getPanel();
        testScreen = new TestScreen().getPanel();
        gameScreen = new GameScreen().getPanel();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents

        //======== this ========
        var contentPane = getContentPane();

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGap(0, 398, Short.MAX_VALUE)
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGap(0, 270, Short.MAX_VALUE)
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // Fucntion used to change panels
    public void changePanel(String choice) {
        if(choice.equals("mainMenu")) {
            this.setContentPane(new MainMenu().getPanel());
        } else if (choice.equals("testScreen")) {
            this.setContentPane(testScreen);
        } else {
            this.setContentPane(new GameScreen().getPanel());
        }
        this.pack();
        this.setLocationRelativeTo(null);
    }
    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
