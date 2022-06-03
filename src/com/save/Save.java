package com.save;

import javax.swing.*;
import java.io.*;

public class Save implements java.io.Serializable {
    private char[][] labelMatrix = new char[6][9];
    private int currentRow;
    private int unfinished;
    private int lost;
    private int won;
    private double averageRow;
    private double averageTime;

    private double time;

    private String equation = new String();
    public Save() {

    }

    public char[][] getLabelMatrix() {
        return labelMatrix;
    }

    public void setLabelMatrix(char[][] labelMatrix) {
        this.labelMatrix = labelMatrix;
    }

    public int getCurrentRow() {
        return currentRow;
    }

    public void setCurrentRow(int currentRow) {
        this.currentRow = currentRow;
    }

    public int getUnfinished() {
        return unfinished;
    }

    public void setUnfinished(int unfinished) {
        this.unfinished = unfinished;
    }

    public int getLost() {
        return lost;
    }

    public void setLost(int lost) {
        this.lost = lost;
    }

    public int getWon() {
        return won;
    }

    public void setWon(int won) {
        this.won = won;
    }

    public double getAverageRow() {
        return averageRow;
    }

    public void setAverageRow(double averageRow) {
        this.averageRow = averageRow;
    }

    public double getAverageTime() {
        return averageTime;
    }

    public void setAverageTime(double averageTime) {
        this.averageTime = averageTime;
    }

    public String getEquation() {
        return equation;
    }

    public void setEquation(String equation) {
        this.equation = equation;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

}


