package com.app;

import com.gui.*;
import com.util.EquationUtil;
import javax.swing.*;

public class App {
        public static Window gameWindow;
    public static void main(String[] args) {
        gameWindow = new Window();
        gameWindow.setResizable(false);
        gameWindow.setLocationRelativeTo(null);
        gameWindow.setVisible(true);
        gameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gameWindow.changePanel("mainMenu");
        gameWindow.pack();

        //System.out.println(new EquationUtil().isValid("3/3*2-1=0"));
        //System.out.println(new EquationUtil().generateEquation());
        //System.out.println(new EquationUtil().calculateEquation("6*164"));
    }


}
