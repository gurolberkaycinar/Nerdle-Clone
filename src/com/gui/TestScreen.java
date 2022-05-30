/*
 * Created by JFormDesigner on Fri May 27 23:08:54 TRT 2022
 */

package com.gui;

import java.awt.*;
import com.util.EquationUtil;

import java.awt.event.*;
import java.beans.*;
import javax.swing.*;
import javax.swing.GroupLayout;

import static com.app.App.gameWindow;

/**
 * @author unknown
 */
public class TestScreen {
    public TestScreen() {
        initComponents();
        testResult.setText(new EquationUtil().generateEquation());
    }

    private void returnMain(ActionEvent e) {
        gameWindow.changePanel("mainMenu");
        gameWindow.pack();
    }

    private void returnMenu(ActionEvent e) {
        gameWindow.changePanel("mainMenu");
        gameWindow.pack();
    }

    private void testResultPropertyChange(PropertyChangeEvent e) {
        // TODO add your code here
    }

    private void button1(ActionEvent e) {
        testResult.setText(new EquationUtil().generateEquation());
    }


    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        panel = new JPanel();
        label1 = new JLabel();
        button1 = new JButton();
        returnMenu = new JButton();
        testResult = new JLabel();
        label55 = new JLabel();

        //======== panel ========
        {

            //---- button1 ----
            button1.setText("Regenerate: ");
            button1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            button1.addActionListener(e -> button1(e));

            //---- returnMenu ----
            returnMenu.setText("Return to Main Menu");
            returnMenu.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            returnMenu.addActionListener(e -> returnMenu(e));

            //---- testResult ----
            testResult.setText("text");
            testResult.setHorizontalAlignment(SwingConstants.CENTER);
            testResult.setFont(testResult.getFont().deriveFont(testResult.getFont().getSize() + 12f));
            testResult.addPropertyChangeListener(e -> testResultPropertyChange(e));

            //---- label55 ----
            label55.setText("20011009 - G\u00fcrol Berkay \u00c7\u0131nar");

            GroupLayout panelLayout = new GroupLayout(panel);
            panel.setLayout(panelLayout);
            panelLayout.setHorizontalGroup(
                panelLayout.createParallelGroup()
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup()
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGap(158, 158, 158)
                                .addComponent(label1)
                                .addGap(119, 119, 119)
                                .addComponent(testResult, GroupLayout.PREFERRED_SIZE, 230, GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGap(336, 336, 336)
                                .addComponent(button1))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGap(313, 313, 313)
                                .addComponent(returnMenu))
                            .addComponent(label55))
                        .addContainerGap(293, Short.MAX_VALUE))
            );
            panelLayout.setVerticalGroup(
                panelLayout.createParallelGroup()
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup()
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGap(171, 171, 171)
                                .addComponent(label1)
                                .addGap(145, 145, 145))
                            .addGroup(GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(testResult, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
                                .addGap(70, 70, 70)))
                        .addComponent(button1)
                        .addGap(18, 18, 18)
                        .addComponent(returnMenu)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 148, Short.MAX_VALUE)
                        .addComponent(label55))
            );
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JPanel panel;
    private JLabel label1;
    private JButton button1;
    private JButton returnMenu;
    private JLabel testResult;
    private JLabel label55;
    // JFormDesigner - End of variables declaration  //GEN-END:variables

    public JPanel getPanel() {
        return panel;
    }
}
