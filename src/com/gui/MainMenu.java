/*
 * Created by JFormDesigner on Fri May 27 22:49:18 TRT 2022
 */

package com.gui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.event.*;

import static com.app.App.gameWindow;

/**
 * @author unknown
 */
public class MainMenu {
    public MainMenu() {
        initComponents();
    }

    private void test(ActionEvent e) {
        gameWindow.changePanel("testScreen");
        gameWindow.pack();
    }

    private void exit(ActionEvent e) {
        gameWindow.dispose();
    }

    private void unfinishedCaretUpdate(CaretEvent e) {
        // TODO add your code here
    }



    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        panel = new JPanel();
        Title = new JLabel();
        label1 = new JLabel();
        newGame = new JButton();
        continueGame = new JButton();
        exit = new JButton();
        label2 = new JLabel();
        unfinished = new JTextField();
        test = new JButton();
        lost = new JTextField();
        won = new JTextField();
        guesses = new JTextField();
        duration = new JTextField();
        label3 = new JLabel();
        label4 = new JLabel();
        label5 = new JLabel();
        label6 = new JLabel();
        label7 = new JLabel();

        //======== panel ========
        {
            panel.setPreferredSize(new Dimension(800, 560));
            panel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            panel.setAlignmentX(0.0F);
            panel.setAlignmentY(0.0F);
            panel.setMaximumSize(new Dimension(800, 560));
            panel.setMinimumSize(new Dimension(800, 560));
            panel.setBorder(null);

            //---- Title ----
            Title.setText("Welcome to Nerdle!");
            Title.setFont(Title.getFont().deriveFont(Title.getFont().getSize() + 32f));
            Title.setHorizontalAlignment(SwingConstants.CENTER);

            //---- label1 ----
            label1.setText("20011009 - G\u00fcrol Berkay \u00c7\u0131nar");

            //---- newGame ----
            newGame.setText("New Game");

            //---- continueGame ----
            continueGame.setText("Continue");

            //---- exit ----
            exit.setText("Exit");
            exit.addActionListener(e -> exit(e));

            //---- label2 ----
            label2.setText("Stats:");

            //---- unfinished ----
            unfinished.setText("15");
            unfinished.addCaretListener(e -> unfinishedCaretUpdate(e));

            //---- test ----
            test.setText("Test");
            test.setFont(test.getFont().deriveFont(test.getFont().getSize() + 5f));
            test.addActionListener(e -> test(e));

            //---- lost ----
            lost.setText("15");

            //---- won ----
            won.setText("15");

            //---- guesses ----
            guesses.setText("15");

            //---- duration ----
            duration.setText("15");

            //---- label3 ----
            label3.setText("Games left unfinished: ");

            //---- label4 ----
            label4.setText("Games lost: ");

            //---- label5 ----
            label5.setText("Games won: ");

            //---- label6 ----
            label6.setText("Average guesses for a win: ");

            //---- label7 ----
            label7.setText("Average duration of a win: ");

            GroupLayout panelLayout = new GroupLayout(panel);
            panel.setLayout(panelLayout);
            panelLayout.setHorizontalGroup(
                panelLayout.createParallelGroup()
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup()
                            .addComponent(label1)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addGroup(panelLayout.createParallelGroup()
                                    .addComponent(exit, GroupLayout.PREFERRED_SIZE, 192, GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panelLayout.createSequentialGroup()
                                        .addComponent(newGame, GroupLayout.PREFERRED_SIZE, 231, GroupLayout.PREFERRED_SIZE)
                                        .addGap(129, 129, 129)
                                        .addComponent(label2))
                                    .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(test, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                                        .addComponent(continueGame, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)))))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                            .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                .addGroup(panelLayout.createSequentialGroup()
                                    .addComponent(label4)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lost, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGroup(panelLayout.createSequentialGroup()
                                    .addComponent(label3)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(unfinished, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGroup(panelLayout.createSequentialGroup()
                                    .addComponent(label5)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(won, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGroup(panelLayout.createSequentialGroup()
                                    .addComponent(label7)
                                    .addGap(18, 18, 18)
                                    .addComponent(duration, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(label6)
                                .addGap(18, 18, 18)
                                .addComponent(guesses, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                        .addGap(157, 157, 157))
                    .addComponent(Title, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );
            panelLayout.setVerticalGroup(
                panelLayout.createParallelGroup()
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(Title, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
                        .addGroup(panelLayout.createParallelGroup()
                            .addGroup(panelLayout.createSequentialGroup()
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(newGame, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(continueGame, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(test, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47)
                                .addComponent(exit, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)
                                .addComponent(label1))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGap(83, 83, 83)
                                .addComponent(label2)
                                .addGap(14, 14, 14)
                                .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(unfinished, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label3))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(lost, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label4))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(won, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label5))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(guesses, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label6))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(duration, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label7))
                                .addContainerGap())))
            );
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JPanel panel;
    private JLabel Title;
    private JLabel label1;
    private JButton newGame;
    private JButton continueGame;
    private JButton exit;
    private JLabel label2;
    private JTextField unfinished;
    private JButton test;
    private JTextField lost;
    private JTextField won;
    private JTextField guesses;
    private JTextField duration;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JLabel label6;
    private JLabel label7;
    // JFormDesigner - End of variables declaration  //GEN-END:variables

    public JPanel getPanel() {
        return panel;
    }
}
