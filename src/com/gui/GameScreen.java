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

import static com.app.App.*;

import com.util.EquationUtil;
import com.util.MatrixUtil;
import com.util.MatrixUtil.*;

/**
 * @author unknown
 */
public class GameScreen {
    private static JLabel[][] labelMatrix = new JLabel[6][9];

    private static JLabel lastSelected;
    private static int selectedX;
    private static int selectedY;

    private int seconds;

    public GameScreen() {
        initComponents();
        labels.setLayout(new GridLayout(6, 9));
        labelMatrix = new MatrixUtil().convertCharToLabel(gameSave.getLabelMatrix());
        System.out.println("Current equation:" + gameSave.getEquation());
        putMatrix(gameSave.getEquation().length());
        seconds = (int) gameSave.getTime();
        Timer t = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
               timer.setText(String.valueOf(seconds));
               seconds++;
            }
        });
        t.start();
    }

    public void putMatrix(int digitCount) {

        for(int i = 0; i < 6; i++) {
            for(int j = 0; j < digitCount; j++) {
                JLabel tmpLabel = labelMatrix[i][j];
                tmpLabel.setBorder(new BevelBorder(BevelBorder.LOWERED));
                tmpLabel.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        labelClicked(e);
                    }
                });
                labels.add(tmpLabel);
            }
            for(int j = digitCount; j < 9; j++) {
                JLabel tmpLabeL = new JLabel();
                tmpLabeL.setVisible(false);
                labels.add(tmpLabeL);
            }
        }
        for(int i = 0; i < gameSave.getCurrentRow(); i++) {
            new MatrixUtil().colorLine(labelMatrix[i]);
        }
        labels.validate();
        labels.repaint();
    }



    private void exit(ActionEvent e) {
        gameSave.setUnfinished(gameSave.getUnfinished() + 1);
        gameSave.setLabelMatrix(new MatrixUtil().convertLabelToChar(labelMatrix));
        gameSave.setTime((double) seconds);
        System.out.println("Saving " + gameSave.getUnfinished());
        saveFile();
        gameWindow.changePanel("mainMenu");
        gameWindow.pack();
    }


    private void labelClicked(MouseEvent e) {
        System.out.println("Current row: " + gameSave.getCurrentRow());
        for(int i = gameSave.getCurrentRow(); i < 6; i++) {
            for(int j = 0; j < 9; j++) {
                labelMatrix[i][j].setBackground(Color.white);
                if(((JLabel)e.getSource()).equals(labelMatrix[i][j])) {
                    System.out.println(i + ", " + j);
                    labelMatrix[i][j].setBackground(Color.blue);
                    lastSelected = labelMatrix[i][j];
                    selectedX = j;
                    selectedY = i;
                }
            }
        }
    }


    private void labelsMouseClicked(MouseEvent e) {
        // TODO add your code here
    }

    private void plus(ActionEvent e) {
        if(lastSelected != null && selectedY == gameSave.getCurrentRow()) {
            lastSelected.setText("+");
        }
    }

    private void button11(ActionEvent e) {
        // TODO add your code here
    }

    private void minus(ActionEvent e) {
        if(lastSelected != null && selectedY == gameSave.getCurrentRow()) {
            lastSelected.setText("-");
        }
    }

    private void button16(ActionEvent e) {
        // TODO add your code here
    }

    private void multiply(ActionEvent e) {
        if(lastSelected != null && selectedY == gameSave.getCurrentRow()) {
            lastSelected.setText("*");
        }
    }

    private void divide(ActionEvent e) {
        if(lastSelected != null && selectedY == gameSave.getCurrentRow()) {
            lastSelected.setText("/");
        }
    }

    private void button0(ActionEvent e) {
        if(lastSelected != null && selectedY == gameSave.getCurrentRow()) {
            lastSelected.setText("0");
        }
    }

    private void button1(ActionEvent e) {
        if(lastSelected != null && selectedY == gameSave.getCurrentRow()) {
            lastSelected.setText("1");
        }
    }

    private void button2(ActionEvent e) {
        if(lastSelected != null && selectedY == gameSave.getCurrentRow()) {
            lastSelected.setText("2");
        }
    }

    private void button3(ActionEvent e) {
        if(lastSelected != null && selectedY == gameSave.getCurrentRow()) {
            lastSelected.setText("3");
        }
    }

    private void button4(ActionEvent e) {
        if(lastSelected != null && selectedY == gameSave.getCurrentRow()) {
            lastSelected.setText("4");
        }
    }

    private void button5(ActionEvent e) {
        if(lastSelected != null && selectedY == gameSave.getCurrentRow()) {
            lastSelected.setText("5");
        }
    }

    private void button6(ActionEvent e) {
        if(lastSelected != null && selectedY == gameSave.getCurrentRow()) {
            lastSelected.setText("6");
        }
    }

    private void button7(ActionEvent e) {
        if(lastSelected != null && selectedY == gameSave.getCurrentRow()) {
            lastSelected.setText("7");
        }
    }

    private void button8(ActionEvent e) {
        if(lastSelected != null && selectedY == gameSave.getCurrentRow()) {
            lastSelected.setText("8");
        }
    }

    private void button9(ActionEvent e) {
        if(lastSelected != null && selectedY == gameSave.getCurrentRow()) {
            lastSelected.setText("9");
        }
    }

    private void guess(ActionEvent e) {
        boolean check = true;
        for(int i = 0; i < gameSave.getEquation().length(); i++) {
            if(labelMatrix[gameSave.getCurrentRow()][i] == null) {
                check = false;
                System.out.println("Invalid length");
            }
        }
        if(check && new EquationUtil().isValid(String.valueOf(new MatrixUtil().convertLabelToChar(labelMatrix[gameSave.getCurrentRow()])).substring(0, gameSave.getEquation().length()))) {
            new MatrixUtil().colorLine(labelMatrix[gameSave.getCurrentRow()]);
            System.out.println("Color");
            if(String.valueOf(new MatrixUtil().convertLabelToChar(labelMatrix[gameSave.getCurrentRow()])).substring(0, gameSave.getEquation().length()).equals(gameSave.getEquation())) {
                System.out.println("Win!");
                JFrame end = new End("You Win!");
                end.setSize(400, 300);
                end.setResizable(false);
                end.setLocationRelativeTo(null);
                end.setVisible(true);
                //end.pack();
                gameSave.setLabelMatrix(new char[6][9]);
                gameSave.setCurrentRow(0);
                gameSave.setEquation(new EquationUtil().generateEquation());
                gameSave.setTime(0);
                saveFile();
                readFile();
                if(gameSave.getWon() == 0) {
                    gameSave.setAverageRow(gameSave.getCurrentRow() - 1);
                    gameSave.setAverageTime(gameSave.getTime());
                } else {
                    gameSave.setAverageRow((gameSave.getAverageRow() * gameSave.getWon() + gameSave.getCurrentRow() - 1) / (gameSave.getWon() + 1));
                    gameSave.setAverageTime((gameSave.getAverageTime() * gameSave.getWon() + gameSave.getTime()) / gameSave.getWon() + 1);
                }
                gameSave.setWon(gameSave.getWon() + 1);
            } else if(gameSave.getCurrentRow() > 4) {
                System.out.println("Lose");
                JFrame end = new End("You lose.\nCorrect Answer: " + gameSave.getEquation());
                end.setResizable(false);
                end.setLocationRelativeTo(null);
                end.setVisible(true);
                end.pack();
                gameSave.setLabelMatrix(new char[6][9]);
                gameSave.setCurrentRow(0);
                gameSave.setEquation(new EquationUtil().generateEquation());
                gameSave.setTime(0);
                saveFile();
                readFile();
                gameSave.setLost(gameSave.getLost() + 1);
            }
            gameSave.setCurrentRow(gameSave.getCurrentRow() + 1);
        }
    }

    private void equal(ActionEvent e) {
        if(lastSelected != null && selectedY == gameSave.getCurrentRow()) {
            lastSelected.setText("=");
        }
    }


    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        panel = new JPanel();
        actions = new JPanel();
        button0 = new JButton();
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();
        button4 = new JButton();
        button5 = new JButton();
        button6 = new JButton();
        button7 = new JButton();
        button8 = new JButton();
        button9 = new JButton();
        plusButton = new JButton();
        minusButton = new JButton();
        multiplyButton = new JButton();
        divideButton = new JButton();
        equalButton = new JButton();
        guessButton = new JButton();
        exitButton = new JButton();
        label55 = new JLabel();
        labels = new JPanel();
        timer = new JLabel();

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

                //---- button0 ----
                button0.setText("0");
                button0.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                button0.addActionListener(e -> {
			button1(e);
			button0(e);
		});

                //---- button1 ----
                button1.setText("1");
                button1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                button1.addActionListener(e -> button1(e));

                //---- button2 ----
                button2.setText("2");
                button2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                button2.addActionListener(e -> button2(e));

                //---- button3 ----
                button3.setText("3");
                button3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                button3.addActionListener(e -> button3(e));

                //---- button4 ----
                button4.setText("4");
                button4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                button4.addActionListener(e -> button4(e));

                //---- button5 ----
                button5.setText("5");
                button5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                button5.addActionListener(e -> button5(e));

                //---- button6 ----
                button6.setText("6");
                button6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                button6.addActionListener(e -> button6(e));

                //---- button7 ----
                button7.setText("7");
                button7.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                button7.addActionListener(e -> button7(e));

                //---- button8 ----
                button8.setText("8");
                button8.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                button8.addActionListener(e -> button8(e));

                //---- button9 ----
                button9.setText("9");
                button9.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                button9.addActionListener(e -> button9(e));

                //---- plusButton ----
                plusButton.setText("+");
                plusButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                plusButton.addActionListener(e -> {
			button11(e);
			plus(e);
		});

                //---- minusButton ----
                minusButton.setText("-");
                minusButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                minusButton.addActionListener(e -> minus(e));

                //---- multiplyButton ----
                multiplyButton.setText("*");
                multiplyButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                multiplyButton.addActionListener(e -> multiply(e));

                //---- divideButton ----
                divideButton.setText("/");
                divideButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                divideButton.addActionListener(e -> divide(e));

                //---- equalButton ----
                equalButton.setText("=");
                equalButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                equalButton.addActionListener(e -> equal(e));

                //---- guessButton ----
                guessButton.setText("Guess");
                guessButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                guessButton.setFont(guessButton.getFont().deriveFont(guessButton.getFont().getSize() - 8f));
                guessButton.addActionListener(e -> {
			button16(e);
			guess(e);
		});

                //---- exitButton ----
                exitButton.setText("Save & Exit");
                exitButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                exitButton.addActionListener(e -> exit(e));

                //---- label55 ----
                label55.setText("20011009 - G\u00fcrol Berkay \u00c7\u0131nar");

                //======== labels ========
                {
                    labels.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mouseClicked(MouseEvent e) {
                            labelsMouseClicked(e);
                        }
                    });
                    labels.setLayout(new GridLayout(6, 9));
                }

                //---- timer ----
                timer.setHorizontalAlignment(SwingConstants.CENTER);

                GroupLayout actionsLayout = new GroupLayout(actions);
                actions.setLayout(actionsLayout);
                actionsLayout.setHorizontalGroup(
                    actionsLayout.createParallelGroup()
                        .addGroup(actionsLayout.createSequentialGroup()
                            .addGap(33, 33, 33)
                            .addGroup(actionsLayout.createParallelGroup()
                                .addGroup(actionsLayout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(label55))
                                .addGroup(actionsLayout.createSequentialGroup()
                                    .addGroup(actionsLayout.createParallelGroup()
                                        .addGroup(actionsLayout.createSequentialGroup()
                                            .addComponent(button0, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(button1, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(button2, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
                                            .addGap(6, 6, 6)
                                            .addComponent(button3, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(button4, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
                                            .addGap(6, 6, 6)
                                            .addComponent(button5, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
                                            .addGap(6, 6, 6)
                                            .addComponent(button6, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
                                            .addGap(6, 6, 6)
                                            .addComponent(button7, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(button8, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(actionsLayout.createSequentialGroup()
                                            .addComponent(plusButton, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
                                            .addGap(6, 6, 6)
                                            .addComponent(minusButton, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
                                            .addGap(6, 6, 6)
                                            .addComponent(multiplyButton, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
                                            .addGap(6, 6, 6)
                                            .addComponent(divideButton, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
                                            .addGap(6, 6, 6)
                                            .addComponent(equalButton, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(guessButton, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(exitButton, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)))
                                    .addGap(6, 6, 6)
                                    .addGroup(actionsLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addGroup(actionsLayout.createSequentialGroup()
                                            .addGap(6, 6, 6)
                                            .addComponent(timer, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addComponent(button9, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE))))
                            .addContainerGap(63, Short.MAX_VALUE))
                        .addComponent(labels, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                );
                actionsLayout.setVerticalGroup(
                    actionsLayout.createParallelGroup()
                        .addGroup(GroupLayout.Alignment.TRAILING, actionsLayout.createSequentialGroup()
                            .addComponent(labels, GroupLayout.PREFERRED_SIZE, 465, GroupLayout.PREFERRED_SIZE)
                            .addGap(38, 38, 38)
                            .addGroup(actionsLayout.createParallelGroup()
                                .addComponent(button6, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
                                .addComponent(button7, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
                                .addComponent(button8, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
                                .addComponent(button9, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
                                .addGroup(actionsLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(button0, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(button1, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE))
                                .addComponent(button2, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
                                .addComponent(button3, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
                                .addComponent(button4, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
                                .addComponent(button5, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(actionsLayout.createParallelGroup()
                                .addComponent(plusButton, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
                                .addComponent(minusButton, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
                                .addComponent(multiplyButton, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
                                .addComponent(divideButton, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
                                .addGroup(actionsLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(equalButton, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(guessButton, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(exitButton, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(timer, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)))
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
    private JButton button0;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JButton plusButton;
    private JButton minusButton;
    private JButton multiplyButton;
    private JButton divideButton;
    private JButton equalButton;
    private JButton guessButton;
    private JButton exitButton;
    private JLabel label55;
    private JPanel labels;
    private JLabel timer;
    // JFormDesigner - End of variables declaration  //GEN-END:variables

    public JPanel getPanel() {
        return panel;
    }

}
