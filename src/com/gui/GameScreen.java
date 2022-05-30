/*
 * Created by JFormDesigner on Sun May 29 23:10:55 TRT 2022
 */

package com.gui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.border.*;

import static com.app.App.gameWindow;

/**
 * @author unknown
 */
public class GameScreen {
    public GameScreen() {
        initComponents();
    }

    private void button1(ActionEvent e) {
        gameWindow.changePanel("mainMenu");
        gameWindow.pack();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        panel = new JPanel();
        button1 = new JButton();
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        label4 = new JLabel();
        label5 = new JLabel();
        label6 = new JLabel();
        label7 = new JLabel();
        label8 = new JLabel();
        label9 = new JLabel();
        label10 = new JLabel();
        label11 = new JLabel();
        label12 = new JLabel();
        label13 = new JLabel();
        label14 = new JLabel();
        label15 = new JLabel();
        label16 = new JLabel();
        label17 = new JLabel();
        label18 = new JLabel();
        label19 = new JLabel();
        label20 = new JLabel();
        label21 = new JLabel();
        label22 = new JLabel();
        label23 = new JLabel();
        label24 = new JLabel();
        label25 = new JLabel();
        label26 = new JLabel();
        label27 = new JLabel();
        label28 = new JLabel();
        label29 = new JLabel();
        label30 = new JLabel();
        label31 = new JLabel();
        label32 = new JLabel();
        label33 = new JLabel();
        label34 = new JLabel();
        label35 = new JLabel();
        label36 = new JLabel();
        label37 = new JLabel();
        label38 = new JLabel();
        label39 = new JLabel();
        label40 = new JLabel();
        label41 = new JLabel();
        label42 = new JLabel();
        label43 = new JLabel();
        label44 = new JLabel();
        label45 = new JLabel();
        label46 = new JLabel();
        label47 = new JLabel();
        label48 = new JLabel();
        label49 = new JLabel();
        label50 = new JLabel();
        label51 = new JLabel();
        label52 = new JLabel();
        label53 = new JLabel();
        label54 = new JLabel();
        label55 = new JLabel();
        label56 = new JLabel();
        label57 = new JLabel();
        label58 = new JLabel();
        label59 = new JLabel();
        label60 = new JLabel();
        label61 = new JLabel();
        label62 = new JLabel();
        label63 = new JLabel();
        label64 = new JLabel();
        label67 = new JLabel();
        label68 = new JLabel();
        label69 = new JLabel();
        label70 = new JLabel();
        label71 = new JLabel();
        label72 = new JLabel();
        label73 = new JLabel();
        panel2 = new JPanel();
        button2 = new JButton();
        label65 = new JLabel();
        label66 = new JLabel();
        label74 = new JLabel();
        label75 = new JLabel();
        label76 = new JLabel();
        label77 = new JLabel();
        label78 = new JLabel();
        label79 = new JLabel();
        label80 = new JLabel();
        label81 = new JLabel();
        label82 = new JLabel();
        label83 = new JLabel();
        label84 = new JLabel();
        label85 = new JLabel();
        label86 = new JLabel();
        label87 = new JLabel();
        label88 = new JLabel();
        label89 = new JLabel();
        label90 = new JLabel();
        label91 = new JLabel();
        label92 = new JLabel();
        label93 = new JLabel();
        label94 = new JLabel();
        label95 = new JLabel();
        label96 = new JLabel();
        label97 = new JLabel();
        label98 = new JLabel();
        label99 = new JLabel();
        label100 = new JLabel();
        label101 = new JLabel();
        label102 = new JLabel();
        label103 = new JLabel();
        label104 = new JLabel();
        label105 = new JLabel();
        label106 = new JLabel();
        label107 = new JLabel();
        label108 = new JLabel();
        label109 = new JLabel();
        label110 = new JLabel();
        label111 = new JLabel();
        label112 = new JLabel();
        label113 = new JLabel();
        label114 = new JLabel();
        label115 = new JLabel();
        label116 = new JLabel();
        label117 = new JLabel();
        label118 = new JLabel();
        label119 = new JLabel();
        label120 = new JLabel();
        label121 = new JLabel();
        label122 = new JLabel();
        label123 = new JLabel();
        label124 = new JLabel();
        label125 = new JLabel();
        label126 = new JLabel();
        label127 = new JLabel();
        label128 = new JLabel();
        label129 = new JLabel();
        label130 = new JLabel();
        label131 = new JLabel();
        label132 = new JLabel();
        label133 = new JLabel();
        label134 = new JLabel();
        label135 = new JLabel();
        label136 = new JLabel();
        label137 = new JLabel();
        label138 = new JLabel();
        label139 = new JLabel();
        label140 = new JLabel();
        label141 = new JLabel();
        label142 = new JLabel();

        //======== panel ========
        {
            panel.setMaximumSize(new Dimension(900, 660));
            panel.setMinimumSize(new Dimension(900, 660));
            panel.setPreferredSize(new Dimension(900, 660));

            //---- button1 ----
            button1.setText("Save and Return");
            button1.setBorder(new BevelBorder(BevelBorder.LOWERED));
            button1.setHorizontalTextPosition(SwingConstants.CENTER);
            button1.addActionListener(e -> button1(e));

            //---- label1 ----
            label1.setText("text");
            label1.setBackground(new Color(102, 255, 153));
            label1.setBorder(new EtchedBorder());
            label1.setHorizontalAlignment(SwingConstants.CENTER);

            //---- label2 ----
            label2.setText("text");
            label2.setBorder(new EtchedBorder());
            label2.setHorizontalAlignment(SwingConstants.CENTER);

            //---- label3 ----
            label3.setText("text");
            label3.setBorder(new EtchedBorder());
            label3.setHorizontalAlignment(SwingConstants.CENTER);

            //---- label4 ----
            label4.setText("text");
            label4.setBorder(new EtchedBorder());
            label4.setHorizontalAlignment(SwingConstants.CENTER);

            //---- label5 ----
            label5.setText("text");
            label5.setBorder(new EtchedBorder());
            label5.setHorizontalAlignment(SwingConstants.CENTER);

            //---- label6 ----
            label6.setText("text");
            label6.setBorder(new EtchedBorder());
            label6.setHorizontalAlignment(SwingConstants.CENTER);

            //---- label7 ----
            label7.setText("text");
            label7.setBorder(new EtchedBorder());
            label7.setHorizontalAlignment(SwingConstants.CENTER);

            //---- label8 ----
            label8.setText("text");
            label8.setBorder(new EtchedBorder());
            label8.setHorizontalAlignment(SwingConstants.CENTER);

            //---- label9 ----
            label9.setText("text");
            label9.setBorder(new EtchedBorder());
            label9.setHorizontalAlignment(SwingConstants.CENTER);

            //---- label10 ----
            label10.setText("text");
            label10.setBackground(new Color(102, 255, 153));
            label10.setBorder(new EtchedBorder());
            label10.setHorizontalAlignment(SwingConstants.CENTER);

            //---- label11 ----
            label11.setText("text");
            label11.setBorder(new EtchedBorder());
            label11.setHorizontalAlignment(SwingConstants.CENTER);

            //---- label12 ----
            label12.setText("text");
            label12.setBorder(new EtchedBorder());
            label12.setHorizontalAlignment(SwingConstants.CENTER);

            //---- label13 ----
            label13.setText("text");
            label13.setBorder(new EtchedBorder());
            label13.setHorizontalAlignment(SwingConstants.CENTER);

            //---- label14 ----
            label14.setText("text");
            label14.setBorder(new EtchedBorder());
            label14.setHorizontalAlignment(SwingConstants.CENTER);

            //---- label15 ----
            label15.setText("text");
            label15.setBorder(new EtchedBorder());
            label15.setHorizontalAlignment(SwingConstants.CENTER);

            //---- label16 ----
            label16.setText("text");
            label16.setBorder(new EtchedBorder());
            label16.setHorizontalAlignment(SwingConstants.CENTER);

            //---- label17 ----
            label17.setText("text");
            label17.setBorder(new EtchedBorder());
            label17.setHorizontalAlignment(SwingConstants.CENTER);

            //---- label18 ----
            label18.setText("text");
            label18.setBorder(new EtchedBorder());
            label18.setHorizontalAlignment(SwingConstants.CENTER);

            //---- label19 ----
            label19.setText("text");
            label19.setBackground(new Color(102, 255, 153));
            label19.setBorder(new EtchedBorder());
            label19.setHorizontalAlignment(SwingConstants.CENTER);

            //---- label20 ----
            label20.setText("text");
            label20.setBorder(new EtchedBorder());
            label20.setHorizontalAlignment(SwingConstants.CENTER);

            //---- label21 ----
            label21.setText("text");
            label21.setBorder(new EtchedBorder());
            label21.setHorizontalAlignment(SwingConstants.CENTER);

            //---- label22 ----
            label22.setText("text");
            label22.setBorder(new EtchedBorder());
            label22.setHorizontalAlignment(SwingConstants.CENTER);

            //---- label23 ----
            label23.setText("text");
            label23.setBorder(new EtchedBorder());
            label23.setHorizontalAlignment(SwingConstants.CENTER);

            //---- label24 ----
            label24.setText("text");
            label24.setBorder(new EtchedBorder());
            label24.setHorizontalAlignment(SwingConstants.CENTER);

            //---- label25 ----
            label25.setText("text");
            label25.setBorder(new EtchedBorder());
            label25.setHorizontalAlignment(SwingConstants.CENTER);

            //---- label26 ----
            label26.setText("text");
            label26.setBorder(new EtchedBorder());
            label26.setHorizontalAlignment(SwingConstants.CENTER);

            //---- label27 ----
            label27.setText("text");
            label27.setBorder(new EtchedBorder());
            label27.setHorizontalAlignment(SwingConstants.CENTER);

            //---- label28 ----
            label28.setText("text");
            label28.setBackground(new Color(102, 255, 153));
            label28.setBorder(new EtchedBorder());
            label28.setHorizontalAlignment(SwingConstants.CENTER);

            //---- label29 ----
            label29.setText("text");
            label29.setBorder(new EtchedBorder());
            label29.setHorizontalAlignment(SwingConstants.CENTER);

            //---- label30 ----
            label30.setText("text");
            label30.setBorder(new EtchedBorder());
            label30.setHorizontalAlignment(SwingConstants.CENTER);

            //---- label31 ----
            label31.setText("text");
            label31.setBorder(new EtchedBorder());
            label31.setHorizontalAlignment(SwingConstants.CENTER);

            //---- label32 ----
            label32.setText("text");
            label32.setBorder(new EtchedBorder());
            label32.setHorizontalAlignment(SwingConstants.CENTER);

            //---- label33 ----
            label33.setText("text");
            label33.setBorder(new EtchedBorder());
            label33.setHorizontalAlignment(SwingConstants.CENTER);

            //---- label34 ----
            label34.setText("text");
            label34.setBorder(new EtchedBorder());
            label34.setHorizontalAlignment(SwingConstants.CENTER);

            //---- label35 ----
            label35.setText("text");
            label35.setBorder(new EtchedBorder());
            label35.setHorizontalAlignment(SwingConstants.CENTER);

            //---- label36 ----
            label36.setText("text");
            label36.setBorder(new EtchedBorder());
            label36.setHorizontalAlignment(SwingConstants.CENTER);

            //---- label37 ----
            label37.setText("text");
            label37.setBackground(new Color(102, 255, 153));
            label37.setBorder(new EtchedBorder());
            label37.setHorizontalAlignment(SwingConstants.CENTER);

            //---- label38 ----
            label38.setText("text");
            label38.setBorder(new EtchedBorder());
            label38.setHorizontalAlignment(SwingConstants.CENTER);

            //---- label39 ----
            label39.setText("text");
            label39.setBorder(new EtchedBorder());
            label39.setHorizontalAlignment(SwingConstants.CENTER);

            //---- label40 ----
            label40.setText("text");
            label40.setBorder(new EtchedBorder());
            label40.setHorizontalAlignment(SwingConstants.CENTER);

            //---- label41 ----
            label41.setText("text");
            label41.setBorder(new EtchedBorder());
            label41.setHorizontalAlignment(SwingConstants.CENTER);

            //---- label42 ----
            label42.setText("text");
            label42.setBorder(new EtchedBorder());
            label42.setHorizontalAlignment(SwingConstants.CENTER);

            //---- label43 ----
            label43.setText("text");
            label43.setBorder(new EtchedBorder());
            label43.setHorizontalAlignment(SwingConstants.CENTER);

            //---- label44 ----
            label44.setText("text");
            label44.setBorder(new EtchedBorder());
            label44.setHorizontalAlignment(SwingConstants.CENTER);

            //---- label45 ----
            label45.setText("text");
            label45.setBorder(new EtchedBorder());
            label45.setHorizontalAlignment(SwingConstants.CENTER);

            //---- label46 ----
            label46.setText("text");
            label46.setBackground(new Color(102, 255, 153));
            label46.setHorizontalAlignment(SwingConstants.CENTER);
            label46.setBorder(new EtchedBorder());

            //---- label47 ----
            label47.setText("text");
            label47.setHorizontalAlignment(SwingConstants.CENTER);
            label47.setBorder(new EtchedBorder());

            //---- label48 ----
            label48.setText("text");
            label48.setHorizontalAlignment(SwingConstants.CENTER);
            label48.setBorder(new EtchedBorder());

            //---- label49 ----
            label49.setText("text");
            label49.setHorizontalAlignment(SwingConstants.CENTER);
            label49.setBorder(new EtchedBorder());

            //---- label50 ----
            label50.setText("text");
            label50.setHorizontalAlignment(SwingConstants.CENTER);
            label50.setBorder(new EtchedBorder());

            //---- label51 ----
            label51.setText("text");
            label51.setHorizontalAlignment(SwingConstants.CENTER);
            label51.setBorder(new EtchedBorder());

            //---- label52 ----
            label52.setText("text");
            label52.setHorizontalAlignment(SwingConstants.CENTER);
            label52.setBorder(new EtchedBorder());

            //---- label53 ----
            label53.setText("text");
            label53.setHorizontalAlignment(SwingConstants.CENTER);
            label53.setBorder(new EtchedBorder());

            //---- label54 ----
            label54.setText("text");
            label54.setHorizontalAlignment(SwingConstants.CENTER);
            label54.setBorder(new EtchedBorder());

            //---- label55 ----
            label55.setText("0");
            label55.setBackground(new Color(102, 255, 153));
            label55.setBorder(new BevelBorder(BevelBorder.LOWERED));
            label55.setHorizontalTextPosition(SwingConstants.CENTER);

            //---- label56 ----
            label56.setText("8");
            label56.setBorder(new BevelBorder(BevelBorder.LOWERED));
            label56.setHorizontalTextPosition(SwingConstants.CENTER);

            //---- label57 ----
            label57.setText("7");
            label57.setBorder(new BevelBorder(BevelBorder.LOWERED));
            label57.setHorizontalTextPosition(SwingConstants.CENTER);

            //---- label58 ----
            label58.setText("6");
            label58.setBorder(new BevelBorder(BevelBorder.LOWERED));
            label58.setHorizontalTextPosition(SwingConstants.CENTER);

            //---- label59 ----
            label59.setText("5");
            label59.setBorder(new BevelBorder(BevelBorder.LOWERED));
            label59.setHorizontalTextPosition(SwingConstants.CENTER);

            //---- label60 ----
            label60.setText("4");
            label60.setBorder(new BevelBorder(BevelBorder.LOWERED));
            label60.setHorizontalTextPosition(SwingConstants.CENTER);

            //---- label61 ----
            label61.setText("3");
            label61.setBorder(new BevelBorder(BevelBorder.LOWERED));
            label61.setHorizontalTextPosition(SwingConstants.CENTER);

            //---- label62 ----
            label62.setText("2");
            label62.setBorder(new BevelBorder(BevelBorder.LOWERED));
            label62.setHorizontalTextPosition(SwingConstants.CENTER);

            //---- label63 ----
            label63.setText("1");
            label63.setBorder(new BevelBorder(BevelBorder.LOWERED));
            label63.setHorizontalTextPosition(SwingConstants.CENTER);

            //---- label64 ----
            label64.setText("9");
            label64.setBackground(new Color(102, 255, 153));
            label64.setBorder(new BevelBorder(BevelBorder.LOWERED));
            label64.setHorizontalTextPosition(SwingConstants.CENTER);

            //---- label67 ----
            label67.setText("Guess");
            label67.setBorder(new BevelBorder(BevelBorder.LOWERED));
            label67.setHorizontalTextPosition(SwingConstants.CENTER);

            //---- label68 ----
            label68.setText("=");
            label68.setBorder(new BevelBorder(BevelBorder.LOWERED));
            label68.setHorizontalTextPosition(SwingConstants.CENTER);

            //---- label69 ----
            label69.setText("/");
            label69.setBorder(new BevelBorder(BevelBorder.LOWERED));
            label69.setHorizontalTextPosition(SwingConstants.CENTER);

            //---- label70 ----
            label70.setText("*");
            label70.setBorder(new BevelBorder(BevelBorder.LOWERED));
            label70.setHorizontalTextPosition(SwingConstants.CENTER);

            //---- label71 ----
            label71.setText("-");
            label71.setBorder(new BevelBorder(BevelBorder.LOWERED));
            label71.setHorizontalTextPosition(SwingConstants.CENTER);

            //---- label72 ----
            label72.setText("+");
            label72.setBorder(new BevelBorder(BevelBorder.LOWERED));
            label72.setHorizontalTextPosition(SwingConstants.CENTER);

            //---- label73 ----
            label73.setText("<-");
            label73.setBorder(new BevelBorder(BevelBorder.LOWERED));
            label73.setHorizontalTextPosition(SwingConstants.CENTER);

            GroupLayout panelLayout = new GroupLayout(panel);
            panel.setLayout(panelLayout);
            panelLayout.setHorizontalGroup(
                panelLayout.createParallelGroup()
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelLayout.createParallelGroup()
                                .addGroup(panelLayout.createSequentialGroup()
                                    .addComponent(label37, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                    .addGap(12, 12, 12)
                                    .addComponent(label45, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                    .addGap(12, 12, 12)
                                    .addComponent(label44, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                    .addGap(12, 12, 12)
                                    .addComponent(label43, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                    .addGap(12, 12, 12)
                                    .addComponent(label42, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                    .addGap(12, 12, 12)
                                    .addComponent(label41, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                    .addGap(12, 12, 12)
                                    .addComponent(label40, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                    .addGap(12, 12, 12)
                                    .addComponent(label39, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                    .addGap(12, 12, 12)
                                    .addComponent(label38, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE))
                                .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                    .addGroup(panelLayout.createSequentialGroup()
                                        .addComponent(label28, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(label36, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(label35, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(label34, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(label33, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(label32, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(label31, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(label30, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(label29, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelLayout.createParallelGroup()
                                        .addGroup(panelLayout.createSequentialGroup()
                                            .addComponent(label19, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                            .addGap(12, 12, 12)
                                            .addComponent(label27, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                            .addGap(12, 12, 12)
                                            .addComponent(label26, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                            .addGap(12, 12, 12)
                                            .addComponent(label25, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                            .addGap(12, 12, 12)
                                            .addComponent(label24, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                            .addGap(12, 12, 12)
                                            .addComponent(label23, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                            .addGap(12, 12, 12)
                                            .addComponent(label22, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                            .addGap(12, 12, 12)
                                            .addComponent(label21, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                            .addGap(12, 12, 12)
                                            .addComponent(label20, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                            .addGroup(panelLayout.createSequentialGroup()
                                                .addComponent(label10, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                                .addGap(12, 12, 12)
                                                .addComponent(label18, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                                .addGap(12, 12, 12)
                                                .addComponent(label17, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                                .addGap(12, 12, 12)
                                                .addComponent(label16, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                                .addGap(12, 12, 12)
                                                .addComponent(label15, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                                .addGap(12, 12, 12)
                                                .addComponent(label14, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                                .addGap(12, 12, 12)
                                                .addComponent(label13, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                                .addGap(12, 12, 12)
                                                .addComponent(label12, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                                .addGap(12, 12, 12)
                                                .addComponent(label11, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE))
                                            .addGroup(panelLayout.createSequentialGroup()
                                                .addComponent(label1, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(label2, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(label3, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(label4, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(label5, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(label6, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(label7, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(label8, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(label9, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)))))
                                .addGroup(GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                                    .addComponent(label46, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                    .addGap(12, 12, 12)
                                    .addComponent(label54, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                    .addGap(12, 12, 12)
                                    .addComponent(label53, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                    .addGap(12, 12, 12)
                                    .addComponent(label52, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                    .addGap(12, 12, 12)
                                    .addComponent(label51, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                    .addGap(12, 12, 12)
                                    .addComponent(label50, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                    .addGap(12, 12, 12)
                                    .addComponent(label49, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                    .addGap(12, 12, 12)
                                    .addComponent(label48, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                    .addGap(12, 12, 12)
                                    .addComponent(label47, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                    .addGroup(panelLayout.createSequentialGroup()
                                        .addComponent(label55, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(label63, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(label62, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(label61, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(label60, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(label59, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(label58, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(label57, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelLayout.createSequentialGroup()
                                        .addComponent(label64, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(label72, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(label71, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(label70, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(label69, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(label68, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(label73, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(label67, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)))
                                .addGap(12, 12, 12)
                                .addGroup(panelLayout.createParallelGroup()
                                    .addComponent(button1, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label56, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(13, Short.MAX_VALUE))
            );
            panelLayout.setVerticalGroup(
                panelLayout.createParallelGroup()
                    .addGroup(GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label1, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label2, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label3, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label4, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label5, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label6, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label7, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label8, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label9, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelLayout.createParallelGroup()
                            .addComponent(label10, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label18, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label17, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label16, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label15, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label14, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label13, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label12, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label11, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelLayout.createParallelGroup()
                            .addComponent(label19, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label27, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label26, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label25, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label24, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label23, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label22, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label21, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label20, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelLayout.createParallelGroup()
                            .addComponent(label28, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label36, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label35, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label34, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label33, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label32, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label31, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label30, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label29, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelLayout.createParallelGroup()
                            .addComponent(label37, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label45, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label44, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label43, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label42, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label41, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label40, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label39, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label38, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelLayout.createParallelGroup()
                            .addComponent(label46, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label54, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label53, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label52, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label51, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label50, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label49, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label48, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label47, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(panelLayout.createParallelGroup()
                            .addComponent(label55, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label63, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label62, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label61, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label60, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label59, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label58, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label57, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label56, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelLayout.createParallelGroup()
                            .addComponent(label64, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label72, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label71, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label70, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label69, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label68, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                            .addComponent(button1, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(label67, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label73, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(37, Short.MAX_VALUE))
            );
        }

        //======== panel2 ========
        {
            panel2.setMaximumSize(new Dimension(900, 660));
            panel2.setMinimumSize(new Dimension(900, 660));
            panel2.setPreferredSize(new Dimension(900, 660));

            //---- button2 ----
            button2.setText("Save and Return");
            button2.setBorder(new BevelBorder(BevelBorder.LOWERED));
            button2.setHorizontalTextPosition(SwingConstants.CENTER);
            button2.addActionListener(e -> button1(e));

            //---- label65 ----
            label65.setText("text");
            label65.setBackground(new Color(102, 255, 153));
            label65.setBorder(new EtchedBorder());
            label65.setHorizontalAlignment(SwingConstants.CENTER);

            //---- label66 ----
            label66.setText("text");
            label66.setBorder(new EtchedBorder());
            label66.setHorizontalAlignment(SwingConstants.CENTER);

            //---- label74 ----
            label74.setText("text");
            label74.setBorder(new EtchedBorder());
            label74.setHorizontalAlignment(SwingConstants.CENTER);

            //---- label75 ----
            label75.setText("text");
            label75.setBorder(new EtchedBorder());
            label75.setHorizontalAlignment(SwingConstants.CENTER);

            //---- label76 ----
            label76.setText("text");
            label76.setBorder(new EtchedBorder());
            label76.setHorizontalAlignment(SwingConstants.CENTER);

            //---- label77 ----
            label77.setText("text");
            label77.setBorder(new EtchedBorder());
            label77.setHorizontalAlignment(SwingConstants.CENTER);

            //---- label78 ----
            label78.setText("text");
            label78.setBorder(new EtchedBorder());
            label78.setHorizontalAlignment(SwingConstants.CENTER);

            //---- label79 ----
            label79.setText("text");
            label79.setBorder(new EtchedBorder());
            label79.setHorizontalAlignment(SwingConstants.CENTER);

            //---- label80 ----
            label80.setText("text");
            label80.setBorder(new EtchedBorder());
            label80.setHorizontalAlignment(SwingConstants.CENTER);

            //---- label81 ----
            label81.setText("text");
            label81.setBackground(new Color(102, 255, 153));
            label81.setBorder(new EtchedBorder());
            label81.setHorizontalAlignment(SwingConstants.CENTER);

            //---- label82 ----
            label82.setText("text");
            label82.setBorder(new EtchedBorder());
            label82.setHorizontalAlignment(SwingConstants.CENTER);

            //---- label83 ----
            label83.setText("text");
            label83.setBorder(new EtchedBorder());
            label83.setHorizontalAlignment(SwingConstants.CENTER);

            //---- label84 ----
            label84.setText("text");
            label84.setBorder(new EtchedBorder());
            label84.setHorizontalAlignment(SwingConstants.CENTER);

            //---- label85 ----
            label85.setText("text");
            label85.setBorder(new EtchedBorder());
            label85.setHorizontalAlignment(SwingConstants.CENTER);

            //---- label86 ----
            label86.setText("text");
            label86.setBorder(new EtchedBorder());
            label86.setHorizontalAlignment(SwingConstants.CENTER);

            //---- label87 ----
            label87.setText("text");
            label87.setBorder(new EtchedBorder());
            label87.setHorizontalAlignment(SwingConstants.CENTER);

            //---- label88 ----
            label88.setText("text");
            label88.setBorder(new EtchedBorder());
            label88.setHorizontalAlignment(SwingConstants.CENTER);

            //---- label89 ----
            label89.setText("text");
            label89.setBorder(new EtchedBorder());
            label89.setHorizontalAlignment(SwingConstants.CENTER);

            //---- label90 ----
            label90.setText("text");
            label90.setBackground(new Color(102, 255, 153));
            label90.setBorder(new EtchedBorder());
            label90.setHorizontalAlignment(SwingConstants.CENTER);

            //---- label91 ----
            label91.setText("text");
            label91.setBorder(new EtchedBorder());
            label91.setHorizontalAlignment(SwingConstants.CENTER);

            //---- label92 ----
            label92.setText("text");
            label92.setBorder(new EtchedBorder());
            label92.setHorizontalAlignment(SwingConstants.CENTER);

            //---- label93 ----
            label93.setText("text");
            label93.setBorder(new EtchedBorder());
            label93.setHorizontalAlignment(SwingConstants.CENTER);

            //---- label94 ----
            label94.setText("text");
            label94.setBorder(new EtchedBorder());
            label94.setHorizontalAlignment(SwingConstants.CENTER);

            //---- label95 ----
            label95.setText("text");
            label95.setBorder(new EtchedBorder());
            label95.setHorizontalAlignment(SwingConstants.CENTER);

            //---- label96 ----
            label96.setText("text");
            label96.setBorder(new EtchedBorder());
            label96.setHorizontalAlignment(SwingConstants.CENTER);

            //---- label97 ----
            label97.setText("text");
            label97.setBorder(new EtchedBorder());
            label97.setHorizontalAlignment(SwingConstants.CENTER);

            //---- label98 ----
            label98.setText("text");
            label98.setBorder(new EtchedBorder());
            label98.setHorizontalAlignment(SwingConstants.CENTER);

            //---- label99 ----
            label99.setText("text");
            label99.setBackground(new Color(102, 255, 153));
            label99.setBorder(new EtchedBorder());
            label99.setHorizontalAlignment(SwingConstants.CENTER);

            //---- label100 ----
            label100.setText("text");
            label100.setBorder(new EtchedBorder());
            label100.setHorizontalAlignment(SwingConstants.CENTER);

            //---- label101 ----
            label101.setText("text");
            label101.setBorder(new EtchedBorder());
            label101.setHorizontalAlignment(SwingConstants.CENTER);

            //---- label102 ----
            label102.setText("text");
            label102.setBorder(new EtchedBorder());
            label102.setHorizontalAlignment(SwingConstants.CENTER);

            //---- label103 ----
            label103.setText("text");
            label103.setBorder(new EtchedBorder());
            label103.setHorizontalAlignment(SwingConstants.CENTER);

            //---- label104 ----
            label104.setText("text");
            label104.setBorder(new EtchedBorder());
            label104.setHorizontalAlignment(SwingConstants.CENTER);

            //---- label105 ----
            label105.setText("text");
            label105.setBorder(new EtchedBorder());
            label105.setHorizontalAlignment(SwingConstants.CENTER);

            //---- label106 ----
            label106.setText("text");
            label106.setBorder(new EtchedBorder());
            label106.setHorizontalAlignment(SwingConstants.CENTER);

            //---- label107 ----
            label107.setText("text");
            label107.setBorder(new EtchedBorder());
            label107.setHorizontalAlignment(SwingConstants.CENTER);

            //---- label108 ----
            label108.setText("text");
            label108.setBackground(new Color(102, 255, 153));
            label108.setBorder(new EtchedBorder());
            label108.setHorizontalAlignment(SwingConstants.CENTER);

            //---- label109 ----
            label109.setText("text");
            label109.setBorder(new EtchedBorder());
            label109.setHorizontalAlignment(SwingConstants.CENTER);

            //---- label110 ----
            label110.setText("text");
            label110.setBorder(new EtchedBorder());
            label110.setHorizontalAlignment(SwingConstants.CENTER);

            //---- label111 ----
            label111.setText("text");
            label111.setBorder(new EtchedBorder());
            label111.setHorizontalAlignment(SwingConstants.CENTER);

            //---- label112 ----
            label112.setText("text");
            label112.setBorder(new EtchedBorder());
            label112.setHorizontalAlignment(SwingConstants.CENTER);

            //---- label113 ----
            label113.setText("text");
            label113.setBorder(new EtchedBorder());
            label113.setHorizontalAlignment(SwingConstants.CENTER);

            //---- label114 ----
            label114.setText("text");
            label114.setBorder(new EtchedBorder());
            label114.setHorizontalAlignment(SwingConstants.CENTER);

            //---- label115 ----
            label115.setText("text");
            label115.setBorder(new EtchedBorder());
            label115.setHorizontalAlignment(SwingConstants.CENTER);

            //---- label116 ----
            label116.setText("text");
            label116.setBorder(new EtchedBorder());
            label116.setHorizontalAlignment(SwingConstants.CENTER);

            //---- label117 ----
            label117.setText("text");
            label117.setBackground(new Color(102, 255, 153));
            label117.setHorizontalAlignment(SwingConstants.CENTER);
            label117.setBorder(new EtchedBorder());

            //---- label118 ----
            label118.setText("text");
            label118.setHorizontalAlignment(SwingConstants.CENTER);
            label118.setBorder(new EtchedBorder());

            //---- label119 ----
            label119.setText("text");
            label119.setHorizontalAlignment(SwingConstants.CENTER);
            label119.setBorder(new EtchedBorder());

            //---- label120 ----
            label120.setText("text");
            label120.setHorizontalAlignment(SwingConstants.CENTER);
            label120.setBorder(new EtchedBorder());

            //---- label121 ----
            label121.setText("text");
            label121.setHorizontalAlignment(SwingConstants.CENTER);
            label121.setBorder(new EtchedBorder());

            //---- label122 ----
            label122.setText("text");
            label122.setHorizontalAlignment(SwingConstants.CENTER);
            label122.setBorder(new EtchedBorder());

            //---- label123 ----
            label123.setText("text");
            label123.setHorizontalAlignment(SwingConstants.CENTER);
            label123.setBorder(new EtchedBorder());

            //---- label124 ----
            label124.setText("text");
            label124.setHorizontalAlignment(SwingConstants.CENTER);
            label124.setBorder(new EtchedBorder());

            //---- label125 ----
            label125.setText("text");
            label125.setHorizontalAlignment(SwingConstants.CENTER);
            label125.setBorder(new EtchedBorder());

            //---- label126 ----
            label126.setText("0");
            label126.setBackground(new Color(102, 255, 153));
            label126.setBorder(new BevelBorder(BevelBorder.LOWERED));
            label126.setHorizontalTextPosition(SwingConstants.CENTER);

            //---- label127 ----
            label127.setText("8");
            label127.setBorder(new BevelBorder(BevelBorder.LOWERED));
            label127.setHorizontalTextPosition(SwingConstants.CENTER);

            //---- label128 ----
            label128.setText("7");
            label128.setBorder(new BevelBorder(BevelBorder.LOWERED));
            label128.setHorizontalTextPosition(SwingConstants.CENTER);

            //---- label129 ----
            label129.setText("6");
            label129.setBorder(new BevelBorder(BevelBorder.LOWERED));
            label129.setHorizontalTextPosition(SwingConstants.CENTER);

            //---- label130 ----
            label130.setText("5");
            label130.setBorder(new BevelBorder(BevelBorder.LOWERED));
            label130.setHorizontalTextPosition(SwingConstants.CENTER);

            //---- label131 ----
            label131.setText("4");
            label131.setBorder(new BevelBorder(BevelBorder.LOWERED));
            label131.setHorizontalTextPosition(SwingConstants.CENTER);

            //---- label132 ----
            label132.setText("3");
            label132.setBorder(new BevelBorder(BevelBorder.LOWERED));
            label132.setHorizontalTextPosition(SwingConstants.CENTER);

            //---- label133 ----
            label133.setText("2");
            label133.setBorder(new BevelBorder(BevelBorder.LOWERED));
            label133.setHorizontalTextPosition(SwingConstants.CENTER);

            //---- label134 ----
            label134.setText("1");
            label134.setBorder(new BevelBorder(BevelBorder.LOWERED));
            label134.setHorizontalTextPosition(SwingConstants.CENTER);

            //---- label135 ----
            label135.setText("9");
            label135.setBackground(new Color(102, 255, 153));
            label135.setBorder(new BevelBorder(BevelBorder.LOWERED));
            label135.setHorizontalTextPosition(SwingConstants.CENTER);

            //---- label136 ----
            label136.setText("Guess");
            label136.setBorder(new BevelBorder(BevelBorder.LOWERED));
            label136.setHorizontalTextPosition(SwingConstants.CENTER);

            //---- label137 ----
            label137.setText("=");
            label137.setBorder(new BevelBorder(BevelBorder.LOWERED));
            label137.setHorizontalTextPosition(SwingConstants.CENTER);

            //---- label138 ----
            label138.setText("/");
            label138.setBorder(new BevelBorder(BevelBorder.LOWERED));
            label138.setHorizontalTextPosition(SwingConstants.CENTER);

            //---- label139 ----
            label139.setText("*");
            label139.setBorder(new BevelBorder(BevelBorder.LOWERED));
            label139.setHorizontalTextPosition(SwingConstants.CENTER);

            //---- label140 ----
            label140.setText("-");
            label140.setBorder(new BevelBorder(BevelBorder.LOWERED));
            label140.setHorizontalTextPosition(SwingConstants.CENTER);

            //---- label141 ----
            label141.setText("+");
            label141.setBorder(new BevelBorder(BevelBorder.LOWERED));
            label141.setHorizontalTextPosition(SwingConstants.CENTER);

            //---- label142 ----
            label142.setText("<-");
            label142.setBorder(new BevelBorder(BevelBorder.LOWERED));
            label142.setHorizontalTextPosition(SwingConstants.CENTER);

            GroupLayout panel2Layout = new GroupLayout(panel2);
            panel2.setLayout(panel2Layout);
            panel2Layout.setHorizontalGroup(
                panel2Layout.createParallelGroup()
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addGroup(panel2Layout.createParallelGroup()
                                .addGroup(panel2Layout.createSequentialGroup()
                                    .addComponent(label108, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                    .addGap(12, 12, 12)
                                    .addComponent(label116, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                    .addGap(12, 12, 12)
                                    .addComponent(label115, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                    .addGap(12, 12, 12)
                                    .addComponent(label114, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                    .addGap(12, 12, 12)
                                    .addComponent(label113, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                    .addGap(12, 12, 12)
                                    .addComponent(label112, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                    .addGap(12, 12, 12)
                                    .addComponent(label111, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                    .addGap(12, 12, 12)
                                    .addComponent(label110, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                    .addGap(12, 12, 12)
                                    .addComponent(label109, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE))
                                .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                    .addGroup(panel2Layout.createSequentialGroup()
                                        .addComponent(label99, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(label107, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(label106, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(label105, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(label104, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(label103, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(label102, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(label101, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(label100, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panel2Layout.createParallelGroup()
                                        .addGroup(panel2Layout.createSequentialGroup()
                                            .addComponent(label90, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                            .addGap(12, 12, 12)
                                            .addComponent(label98, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                            .addGap(12, 12, 12)
                                            .addComponent(label97, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                            .addGap(12, 12, 12)
                                            .addComponent(label96, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                            .addGap(12, 12, 12)
                                            .addComponent(label95, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                            .addGap(12, 12, 12)
                                            .addComponent(label94, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                            .addGap(12, 12, 12)
                                            .addComponent(label93, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                            .addGap(12, 12, 12)
                                            .addComponent(label92, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                            .addGap(12, 12, 12)
                                            .addComponent(label91, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                            .addGroup(panel2Layout.createSequentialGroup()
                                                .addComponent(label81, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                                .addGap(12, 12, 12)
                                                .addComponent(label89, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                                .addGap(12, 12, 12)
                                                .addComponent(label88, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                                .addGap(12, 12, 12)
                                                .addComponent(label87, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                                .addGap(12, 12, 12)
                                                .addComponent(label86, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                                .addGap(12, 12, 12)
                                                .addComponent(label85, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                                .addGap(12, 12, 12)
                                                .addComponent(label84, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                                .addGap(12, 12, 12)
                                                .addComponent(label83, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                                .addGap(12, 12, 12)
                                                .addComponent(label82, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE))
                                            .addGroup(panel2Layout.createSequentialGroup()
                                                .addComponent(label65, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(label66, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(label74, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(label75, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(label76, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(label77, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(label78, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(label79, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(label80, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)))))
                                .addGroup(GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                                    .addComponent(label117, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                    .addGap(12, 12, 12)
                                    .addComponent(label125, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                    .addGap(12, 12, 12)
                                    .addComponent(label124, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                    .addGap(12, 12, 12)
                                    .addComponent(label123, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                    .addGap(12, 12, 12)
                                    .addComponent(label122, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                    .addGap(12, 12, 12)
                                    .addComponent(label121, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                    .addGap(12, 12, 12)
                                    .addComponent(label120, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                    .addGap(12, 12, 12)
                                    .addComponent(label119, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                    .addGap(12, 12, 12)
                                    .addComponent(label118, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panel2Layout.createSequentialGroup()
                                .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                    .addGroup(panel2Layout.createSequentialGroup()
                                        .addComponent(label126, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(label134, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(label133, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(label132, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(label131, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(label130, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(label129, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(label128, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panel2Layout.createSequentialGroup()
                                        .addComponent(label135, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(label141, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(label140, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(label139, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(label138, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(label137, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(label142, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(label136, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)))
                                .addGap(12, 12, 12)
                                .addGroup(panel2Layout.createParallelGroup()
                                    .addComponent(button2, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label127, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(13, Short.MAX_VALUE))
            );
            panel2Layout.setVerticalGroup(
                panel2Layout.createParallelGroup()
                    .addGroup(GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label65, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label66, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label74, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label75, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label76, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label77, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label78, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label79, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label80, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel2Layout.createParallelGroup()
                            .addComponent(label81, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label89, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label88, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label87, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label86, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label85, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label84, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label83, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label82, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel2Layout.createParallelGroup()
                            .addComponent(label90, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label98, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label97, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label96, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label95, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label94, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label93, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label92, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label91, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel2Layout.createParallelGroup()
                            .addComponent(label99, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label107, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label106, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label105, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label104, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label103, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label102, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label101, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label100, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel2Layout.createParallelGroup()
                            .addComponent(label108, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label116, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label115, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label114, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label113, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label112, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label111, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label110, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label109, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel2Layout.createParallelGroup()
                            .addComponent(label117, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label125, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label124, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label123, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label122, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label121, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label120, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label119, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label118, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(panel2Layout.createParallelGroup()
                            .addComponent(label126, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label134, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label133, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label132, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label131, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label130, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label129, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label128, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label127, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel2Layout.createParallelGroup()
                            .addComponent(label135, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label141, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label140, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label139, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label138, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label137, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                            .addComponent(button2, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
                            .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(label136, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label142, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(37, Short.MAX_VALUE))
            );
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JPanel panel;
    private JButton button1;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JLabel label6;
    private JLabel label7;
    private JLabel label8;
    private JLabel label9;
    private JLabel label10;
    private JLabel label11;
    private JLabel label12;
    private JLabel label13;
    private JLabel label14;
    private JLabel label15;
    private JLabel label16;
    private JLabel label17;
    private JLabel label18;
    private JLabel label19;
    private JLabel label20;
    private JLabel label21;
    private JLabel label22;
    private JLabel label23;
    private JLabel label24;
    private JLabel label25;
    private JLabel label26;
    private JLabel label27;
    private JLabel label28;
    private JLabel label29;
    private JLabel label30;
    private JLabel label31;
    private JLabel label32;
    private JLabel label33;
    private JLabel label34;
    private JLabel label35;
    private JLabel label36;
    private JLabel label37;
    private JLabel label38;
    private JLabel label39;
    private JLabel label40;
    private JLabel label41;
    private JLabel label42;
    private JLabel label43;
    private JLabel label44;
    private JLabel label45;
    private JLabel label46;
    private JLabel label47;
    private JLabel label48;
    private JLabel label49;
    private JLabel label50;
    private JLabel label51;
    private JLabel label52;
    private JLabel label53;
    private JLabel label54;
    private JLabel label55;
    private JLabel label56;
    private JLabel label57;
    private JLabel label58;
    private JLabel label59;
    private JLabel label60;
    private JLabel label61;
    private JLabel label62;
    private JLabel label63;
    private JLabel label64;
    private JLabel label67;
    private JLabel label68;
    private JLabel label69;
    private JLabel label70;
    private JLabel label71;
    private JLabel label72;
    private JLabel label73;
    private JPanel panel2;
    private JButton button2;
    private JLabel label65;
    private JLabel label66;
    private JLabel label74;
    private JLabel label75;
    private JLabel label76;
    private JLabel label77;
    private JLabel label78;
    private JLabel label79;
    private JLabel label80;
    private JLabel label81;
    private JLabel label82;
    private JLabel label83;
    private JLabel label84;
    private JLabel label85;
    private JLabel label86;
    private JLabel label87;
    private JLabel label88;
    private JLabel label89;
    private JLabel label90;
    private JLabel label91;
    private JLabel label92;
    private JLabel label93;
    private JLabel label94;
    private JLabel label95;
    private JLabel label96;
    private JLabel label97;
    private JLabel label98;
    private JLabel label99;
    private JLabel label100;
    private JLabel label101;
    private JLabel label102;
    private JLabel label103;
    private JLabel label104;
    private JLabel label105;
    private JLabel label106;
    private JLabel label107;
    private JLabel label108;
    private JLabel label109;
    private JLabel label110;
    private JLabel label111;
    private JLabel label112;
    private JLabel label113;
    private JLabel label114;
    private JLabel label115;
    private JLabel label116;
    private JLabel label117;
    private JLabel label118;
    private JLabel label119;
    private JLabel label120;
    private JLabel label121;
    private JLabel label122;
    private JLabel label123;
    private JLabel label124;
    private JLabel label125;
    private JLabel label126;
    private JLabel label127;
    private JLabel label128;
    private JLabel label129;
    private JLabel label130;
    private JLabel label131;
    private JLabel label132;
    private JLabel label133;
    private JLabel label134;
    private JLabel label135;
    private JLabel label136;
    private JLabel label137;
    private JLabel label138;
    private JLabel label139;
    private JLabel label140;
    private JLabel label141;
    private JLabel label142;
    // JFormDesigner - End of variables declaration  //GEN-END:variables

    public JPanel getPanel() {
        return panel;
    }
}
