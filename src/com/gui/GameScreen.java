/*
 * Created by JFormDesigner on Sun May 29 23:10:55 TRT 2022
 */

package com.gui;

import java.awt.*;
import java.awt.event.*;
import java.beans.*;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.border.*;

import static com.app.App.gameWindow;

/**
 * @author unknown
 */
public class GameScreen {
    private JLabel[][] labelMatrix = new JLabel[6][9];
    public GameScreen() {
        initComponents();
    }

    private void button1(ActionEvent e) {
        gameWindow.changePanel("mainMenu");
        gameWindow.pack();
    }

    private void exitPropertyChange(PropertyChangeEvent e) {
        // TODO add your code here
    }
    private void exit(ActionEvent e) {
        gameWindow.changePanel("mainMenu");
        gameWindow.pack();
    }

    private void button16(ActionEvent e) {
        // TODO add your code here
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        panel = new JPanel();
        actions = new JPanel();
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();
        button4 = new JButton();
        button5 = new JButton();
        button6 = new JButton();
        button7 = new JButton();
        button8 = new JButton();
        button9 = new JButton();
        button10 = new JButton();
        button11 = new JButton();
        button12 = new JButton();
        button13 = new JButton();
        button14 = new JButton();
        button15 = new JButton();
        button16 = new JButton();
        exitButton = new JButton();
        label55 = new JLabel();
        labels = new JPanel();

        //======== panel ========
        {
            panel.setMaximumSize(new Dimension(900, 660));
            panel.setMinimumSize(new Dimension(900, 660));
            panel.setPreferredSize(new Dimension(900, 660));
            panel.setLayout(null);

            //======== actions ========
            {
                actions.setMaximumSize(new Dimension(900, 660));
                actions.setMinimumSize(new Dimension(900, 660));
                actions.setPreferredSize(new Dimension(900, 660));

                //---- button1 ----
                button1.setText("0");
                button1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

                //---- button2 ----
                button2.setText("1");
                button2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

                //---- button3 ----
                button3.setText("2");
                button3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

                //---- button4 ----
                button4.setText("3");
                button4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

                //---- button5 ----
                button5.setText("4");
                button5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

                //---- button6 ----
                button6.setText("5");
                button6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

                //---- button7 ----
                button7.setText("6");
                button7.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

                //---- button8 ----
                button8.setText("7");
                button8.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

                //---- button9 ----
                button9.setText("8");
                button9.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

                //---- button10 ----
                button10.setText("9");
                button10.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

                //---- button11 ----
                button11.setText("+");
                button11.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

                //---- button12 ----
                button12.setText("-");
                button12.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

                //---- button13 ----
                button13.setText("*");
                button13.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

                //---- button14 ----
                button14.setText("/");
                button14.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

                //---- button15 ----
                button15.setText("=");
                button15.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

                //---- button16 ----
                button16.setText("Guess");
                button16.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                button16.addActionListener(e -> button16(e));

                //---- exitButton ----
                exitButton.setText("Save & Exit");
                exitButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                exitButton.addActionListener(e -> exit(e));

                //---- label55 ----
                label55.setText("20011009 - G\u00fcrol Berkay \u00c7\u0131nar");

                //======== labels ========
                {
                    labels.setLayout(new GridLayout());
                }

                GroupLayout actionsLayout = new GroupLayout(actions);
                actions.setLayout(actionsLayout);
                actionsLayout.setHorizontalGroup(
                    actionsLayout.createParallelGroup()
                        .addGroup(actionsLayout.createSequentialGroup()
                            .addGap(33, 33, 33)
                            .addGroup(actionsLayout.createParallelGroup()
                                .addGroup(actionsLayout.createSequentialGroup()
                                    .addComponent(button11, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
                                    .addGap(6, 6, 6)
                                    .addComponent(button12, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
                                    .addGap(6, 6, 6)
                                    .addComponent(button13, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
                                    .addGap(6, 6, 6)
                                    .addComponent(button14, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
                                    .addGap(6, 6, 6)
                                    .addComponent(button15, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(button16, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(exitButton, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE))
                                .addGroup(actionsLayout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(label55))
                                .addGroup(actionsLayout.createSequentialGroup()
                                    .addComponent(button1, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(button2, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(button3, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
                                    .addGap(6, 6, 6)
                                    .addComponent(button4, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(button5, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
                                    .addGap(6, 6, 6)
                                    .addComponent(button6, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
                                    .addGap(6, 6, 6)
                                    .addComponent(button7, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
                                    .addGap(6, 6, 6)
                                    .addComponent(button8, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(button9, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
                                    .addGap(6, 6, 6)
                                    .addComponent(button10, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)))
                            .addContainerGap(63, Short.MAX_VALUE))
                        .addGroup(GroupLayout.Alignment.TRAILING, actionsLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(labels, GroupLayout.DEFAULT_SIZE, 888, Short.MAX_VALUE)
                            .addContainerGap())
                );
                actionsLayout.setVerticalGroup(
                    actionsLayout.createParallelGroup()
                        .addGroup(GroupLayout.Alignment.TRAILING, actionsLayout.createSequentialGroup()
                            .addComponent(labels, GroupLayout.PREFERRED_SIZE, 465, GroupLayout.PREFERRED_SIZE)
                            .addGap(12, 12, 12)
                            .addGroup(actionsLayout.createParallelGroup()
                                .addComponent(button7, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
                                .addComponent(button8, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
                                .addComponent(button9, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
                                .addComponent(button10, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
                                .addGroup(actionsLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(button1, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(button2, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE))
                                .addComponent(button3, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
                                .addComponent(button4, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
                                .addComponent(button5, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
                                .addComponent(button6, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                            .addGroup(actionsLayout.createParallelGroup()
                                .addComponent(button11, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
                                .addComponent(button12, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
                                .addComponent(button13, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
                                .addComponent(button14, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
                                .addGroup(actionsLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(button15, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(button16, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(exitButton, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(label55))
                );
            }
            panel.add(actions);
            actions.setBounds(0, 0, actions.getPreferredSize().width, 660);

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < panel.getComponentCount(); i++) {
                    Rectangle bounds = panel.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = panel.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                panel.setMinimumSize(preferredSize);
                panel.setPreferredSize(preferredSize);
            }
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JPanel panel;
    private JPanel actions;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JButton button10;
    private JButton button11;
    private JButton button12;
    private JButton button13;
    private JButton button14;
    private JButton button15;
    private JButton button16;
    private JButton exitButton;
    private JLabel label55;
    private JPanel labels;
    // JFormDesigner - End of variables declaration  //GEN-END:variables

    public JPanel getPanel() {
        return panel;
    }
}
