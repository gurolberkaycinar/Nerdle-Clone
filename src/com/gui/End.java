/*
 * Created by JFormDesigner on Fri Jun 03 18:13:01 TRT 2022
 */

package com.gui;

import com.util.EquationUtil;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.border.*;

import static com.app.App.gameSave;
import static com.app.App.gameWindow;

/**
 * @author unknown
 */
public class End extends JFrame {
    public End(String text) {
        initComponents();
        JLabel label = new JLabel(text, SwingConstants.CENTER);
        label.setFont(new Font("Ubuntu", Font.PLAIN, 30));
        label.setVisible(true);
        label.setSize(200, 100);
        add(label);
    }


    private void button1(ActionEvent e) {
        gameSave.setLabelMatrix(new char[6][9]);
        gameSave.setCurrentRow(0);
        gameSave.setEquation(new EquationUtil().generateEquation());
        gameWindow.changePanel("mainMenu");
        super.dispose();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        button1 = new JButton();

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //---- button1 ----
        button1.setText("Return to Main Menu");
        button1.addActionListener(e -> button1(e));
        contentPane.add(button1, BorderLayout.SOUTH);
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JButton button1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
