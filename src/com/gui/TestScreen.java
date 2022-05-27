/*
 * Created by JFormDesigner on Fri May 27 23:08:54 TRT 2022
 */

package com.gui;

import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;

import static com.app.App.gameWindow;

/**
 * @author unknown
 */
public class TestScreen {
    public TestScreen() {
        initComponents();
    }

    private void returnMain(ActionEvent e) {
        gameWindow.changePanel("mainMenu");
        gameWindow.pack();
    }

    private void returnMenu(ActionEvent e) {
        gameWindow.changePanel("mainMenu");
        gameWindow.pack();
    }


    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        panel = new JPanel();
        label1 = new JLabel();
        button1 = new JButton();
        textField1 = new JTextField();
        returnMenu = new JButton();

        //======== panel ========
        {

            //---- button1 ----
            button1.setText("Regenerate: ");

            //---- returnMenu ----
            returnMenu.setText("Return to Main Menu");
            returnMenu.addActionListener(e -> returnMenu(e));

            GroupLayout panelLayout = new GroupLayout(panel);
            panel.setLayout(panelLayout);
            panelLayout.setHorizontalGroup(
                panelLayout.createParallelGroup()
                    .addGroup(GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                        .addGap(0, 260, Short.MAX_VALUE)
                        .addComponent(textField1, GroupLayout.PREFERRED_SIZE, 282, GroupLayout.PREFERRED_SIZE)
                        .addGap(258, 258, 258))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup()
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGap(158, 158, 158)
                                .addComponent(label1))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGap(336, 336, 336)
                                .addComponent(button1))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGap(313, 313, 313)
                                .addComponent(returnMenu)))
                        .addContainerGap(314, Short.MAX_VALUE))
            );
            panelLayout.setVerticalGroup(
                panelLayout.createParallelGroup()
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(label1)
                        .addGap(11, 11, 11)
                        .addComponent(textField1, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(button1)
                        .addGap(18, 18, 18)
                        .addComponent(returnMenu)
                        .addContainerGap(164, Short.MAX_VALUE))
            );
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JPanel panel;
    private JLabel label1;
    private JButton button1;
    private JTextField textField1;
    private JButton returnMenu;
    // JFormDesigner - End of variables declaration  //GEN-END:variables

    public JPanel getPanel() {
        return panel;
    }
}
