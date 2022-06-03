/*
 * Created by JFormDesigner on Fri May 27 22:49:18 TRT 2022
 */

package com.gui;

import com.util.EquationUtil;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.border.*;
import javax.swing.event.*;

import static com.app.App.*;

/**
 * @author unknown
 */
public class MainMenu {
    public MainMenu() {
        initComponents();
        unfinished.setText(Integer.toString(gameSave.getUnfinished()));
        won.setText(Integer.toString(gameSave.getWon()));
        lost.setText(Integer.toString(gameSave.getLost()));
        guess.setText(Double.toString(gameSave.getAverageRow()));
        duration.setText(Double.toString(gameSave.getAverageTime()));
        if(gameSave.getCurrentRow() == 0) {
            continueGame.setVisible(false);
        }
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

    private void newGame(ActionEvent e) {
        gameSave.setLabelMatrix(new char[6][9]);
        gameSave.setCurrentRow(0);
        gameSave.setEquation(new EquationUtil().generateEquation());
        gameSave.setTime(0);
        saveFile();
        readFile();
        gameWindow.changePanel("gameWindow");
    }

    private void continueGame(ActionEvent e) {
        gameWindow.changePanel("gameWindow");
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
        test = new JButton();
        label3 = new JLabel();
        label4 = new JLabel();
        label5 = new JLabel();
        label6 = new JLabel();
        label7 = new JLabel();
        unfinished = new JLabel();
        lost = new JLabel();
        won = new JLabel();
        guess = new JLabel();
        duration = new JLabel();

        //======== panel ========
        {
            panel.setPreferredSize(new Dimension(800, 560));
            panel.setAlignmentX(0.0F);
            panel.setAlignmentY(0.0F);
            panel.setMaximumSize(new Dimension(800, 560));
            panel.setMinimumSize(new Dimension(800, 560));
            panel.setBorder(null);
            panel.setBackground(new Color(38, 70, 83));

            //---- Title ----
            Title.setText("Welcome to Nerdle!");
            Title.setFont(Title.getFont().deriveFont(Title.getFont().getSize() + 32f));
            Title.setHorizontalAlignment(SwingConstants.CENTER);
            Title.setBackground(new Color(60, 108, 186));

            //---- label1 ----
            label1.setText("20011009 - G\u00fcrol Berkay \u00c7\u0131nar");

            //---- newGame ----
            newGame.setText("New Game");
            newGame.setBackground(new Color(42, 157, 143));
            newGame.setForeground(new Color(255, 51, 51));
            newGame.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(42, 157, 143), null, null, null));
            newGame.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            newGame.addActionListener(e -> newGame(e));

            //---- continueGame ----
            continueGame.setText("Continue");
            continueGame.setBackground(new Color(42, 157, 143));
            continueGame.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            continueGame.addActionListener(e -> continueGame(e));

            //---- exit ----
            exit.setText("Exit");
            exit.setBackground(new Color(42, 157, 143));
            exit.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            exit.addActionListener(e -> exit(e));

            //---- label2 ----
            label2.setText("Stats:");

            //---- test ----
            test.setText("Test");
            test.setFont(test.getFont().deriveFont(test.getFont().getSize() + 5f));
            test.setBackground(new Color(42, 157, 143));
            test.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            test.addActionListener(e -> test(e));

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

            //---- unfinished ----
            unfinished.setText("text");

            //---- lost ----
            lost.setText("text");

            //---- won ----
            won.setText("text");

            //---- guess ----
            guess.setText("text");

            //---- duration ----
            duration.setText("text");

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
                                    .addGroup(panelLayout.createSequentialGroup()
                                        .addComponent(newGame, GroupLayout.PREFERRED_SIZE, 231, GroupLayout.PREFERRED_SIZE)
                                        .addGap(129, 129, 129)
                                        .addComponent(label2))
                                    .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(test, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                                        .addComponent(continueGame, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE))
                                    .addComponent(exit, GroupLayout.PREFERRED_SIZE, 152, GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                            .addGroup(GroupLayout.Alignment.LEADING, panelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                .addGroup(GroupLayout.Alignment.LEADING, panelLayout.createSequentialGroup()
                                    .addComponent(label5)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(won, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE))
                                .addGroup(GroupLayout.Alignment.LEADING, panelLayout.createSequentialGroup()
                                    .addComponent(label4)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lost, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE))
                                .addGroup(GroupLayout.Alignment.LEADING, panelLayout.createSequentialGroup()
                                    .addComponent(label3)
                                    .addGap(51, 51, 51)
                                    .addComponent(unfinished, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                .addGroup(panelLayout.createSequentialGroup()
                                    .addComponent(label6)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(guess, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE))
                                .addGroup(GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                                    .addComponent(label7)
                                    .addGap(24, 24, 24)
                                    .addComponent(duration, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE))))
                        .addGap(142, 142, 142))
                    .addGroup(GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                        .addComponent(Title, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
            );
            panelLayout.setVerticalGroup(
                panelLayout.createParallelGroup()
                    .addGroup(panelLayout.createSequentialGroup()
                        .addContainerGap()
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
                                .addComponent(exit, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(label1))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGap(103, 103, 103)
                                .addComponent(label2)
                                .addGap(15, 15, 15)
                                .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(label3)
                                    .addComponent(unfinished))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(label4)
                                    .addComponent(lost))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(label5)
                                    .addComponent(won))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(guess)
                                    .addComponent(label6))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(label7)
                                    .addComponent(duration))
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
    private JButton test;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JLabel label6;
    private JLabel label7;
    private JLabel unfinished;
    private JLabel lost;
    private JLabel won;
    private JLabel guess;
    private JLabel duration;
    // JFormDesigner - End of variables declaration  //GEN-END:variables

    public JPanel getPanel() {
        return panel;
    }

}
