/*
 * Created by JFormDesigner on Fri May 27 23:08:54 TRT 2022
 */

package com.gui;

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

        //======== panel ========
        {

            //---- button1 ----
            button1.setText("Regenerate: ");
            button1.addActionListener(e -> button1(e));

            //---- returnMenu ----
            returnMenu.setText("Return to Main Menu");
            returnMenu.addActionListener(e -> returnMenu(e));

            //---- testResult ----
            testResult.setText("text");
            testResult.addPropertyChangeListener(e -> testResultPropertyChange(e));

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
                                .addComponent(returnMenu)))
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
                        .addContainerGap(166, Short.MAX_VALUE))
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
    // JFormDesigner - End of variables declaration  //GEN-END:variables

    public JPanel getPanel() {
        return panel;
    }
}
