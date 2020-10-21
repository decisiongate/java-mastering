package mastering;

import javax.swing.*;
import java.io.*;

public class MainApp {

    public static void main(String[] args) {

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    StringCalculator stringCalc = new StringCalculator();
                    stringCalc.stringCalcutatorTask();
                } catch (Exception ex) {
                    System.out.print("Error: "+ex.toString());
                }
            }
        }).start();

    }
}
