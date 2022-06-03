package com.app;

import com.gui.*;
import com.save.Save;
import com.util.EquationUtil;
import javax.swing.*;
import java.io.*;

public class App {
        public static Window gameWindow;
        public static Save gameSave = new Save();
    public static void main(String[] args) {
        readFile();
        gameWindow = new Window();
        gameWindow.setResizable(false);
        gameWindow.setLocationRelativeTo(null);
        gameWindow.setVisible(true);
        gameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gameWindow.setTitle("Nerdle");
        gameWindow.changePanel("mainMenu");
        gameWindow.pack();

    }

    public static void saveFile() {
        try {
            ObjectOutputStream writer = new ObjectOutputStream(new FileOutputStream("save.dat"));
            writer.writeObject(gameSave);
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void readFile() {
        File file = new File("save.dat");
        if(!file.exists()) {
            System.out.println("creating file");
            try {
                file.createNewFile();
                gameSave.setCurrentRow(0);
                gameSave.setUnfinished(0);
                gameSave.setLost(0);
                gameSave.setWon(0);
                gameSave.setAverageRow(0);
                gameSave.setAverageTime(0);
                gameSave.setEquation(new EquationUtil().generateEquation());
                gameSave.setTime(0);
                System.out.println("CURRENT EQUATION: " + gameSave.getEquation());
                gameSave.setLabelMatrix(new char[6][9]);
                try {
                    ObjectOutputStream writer = new ObjectOutputStream(new FileOutputStream("save.dat"));
                    writer.writeObject(gameSave);
                    writer.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("reading");
            try {
                ObjectInputStream reader = new ObjectInputStream(new FileInputStream("save.dat"));
                gameSave = (Save)reader.readObject();
                reader.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
