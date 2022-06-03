package com.util;

import javax.swing.*;
import java.awt.*;

import static com.app.App.gameSave;

public class MatrixUtil {

    public char[][] convertLabelToChar(JLabel[][] labelMatrix) {
        char[][] charMatrix = new char[6][9];
        for(int i = 0; i < 6; i++) {
            for(int j = 0; j < 9; j++) {
                charMatrix[i][j] = labelMatrix[i][j].getText().charAt(0);
            }
        }
        return charMatrix;
    }

    public char[] convertLabelToChar(JLabel[] labels) {
        char[] line = new char[9];
        for(int i = 0; i < 9; i++) {
            line[i] = labels[i].getText().charAt(0);
        }
        return line;
    }

    public JLabel[][] convertCharToLabel(char[][] charMatrix) {
        JLabel[][] labelMatrix = new JLabel[6][9];
        for(int i = 0; i < 6; i++) {
            for(int j = 0; j < 9; j++) {
                labelMatrix[i][j] = new JLabel();
                labelMatrix[i][j].setText(Character.toString(charMatrix[i][j]));
                labelMatrix[i][j].setOpaque(true);
                labelMatrix[i][j].setBackground(Color.white);
                labelMatrix[i][j].setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        }
        return labelMatrix;
    }

    public void colorLine(JLabel[] line) {
        for(int i = 0; i < gameSave.getEquation().length(); i++) {
            line[i].setBackground(Color.red);
            if(convertLabelToChar(line)[i] == gameSave.getEquation().charAt(i)) {
                line[i].setBackground(Color.green);
            }
        }
        int count = 0;
        char num;
        for(int i = 0; i < gameSave.getEquation().length(); i++) {
            if(convertLabelToChar(line)[i] != gameSave.getEquation().charAt(i)) {
                num = convertLabelToChar(line)[i];
                count = 0;
                for(int j = 0; j < gameSave.getEquation().length(); j++) {
                    if(i != j && convertLabelToChar(line)[i] != gameSave.getEquation().charAt(i) && convertLabelToChar(line)[i] == gameSave.getEquation().charAt(j) && convertLabelToChar(line)[j] != gameSave.getEquation().charAt(j)) {
                        line[i].setBackground(Color.yellow);
                    }

                    /*
                    if(i != j && convertLabelToChar(line)[i] != gameSave.getEquation().charAt(i)) {
                        count++;
                    }
                    */
                }
                /*
                for(int j = 0; j < gameSave.getEquation().length(); i++) {
                    if(convertLabelToChar(line)[j] == num && count > 0) {
                        count--;
                        line[j].setBackground(Color.yellow);
                    }
                }

                 */
            }
        }
    }
}
