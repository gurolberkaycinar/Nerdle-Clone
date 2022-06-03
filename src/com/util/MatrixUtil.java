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
        for(int i = 0; i < 6; i++) {
            if(convertLabelToChar(line)[i] == gameSave.getEquation().charAt(i)) {
                line[i].setBackground(Color.green);
            }
        }
    }
}
