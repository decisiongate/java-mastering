package mastering;

import javax.swing.*;
import java.io.*;
import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Select menu option: ");
        String menuOption = scanner.nextLine();
        System.out.println("Selected menu option: " + menuOption);

        if(menuOption.equals("1")) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        StringCalculator stringCalc = new StringCalculator();
                        stringCalc.stringCalcutatorTask();
                    } catch (Exception ex) {
                        System.out.print("Error: " + ex.toString());
                    }
                }
            }).start();
        }

        if(menuOption.equals("2")) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        ArraysMethods arraysMethods = new ArraysMethods();
                        arraysMethods.Tasks();
                    } catch (Exception ex) {
                        System.out.print("Error: " + ex.toString());
                    }
                }
            }).start();
        }

        if(menuOption.equals("3")) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        /*     *******************************     */
                        Operators operators = new Operators();
                        operators.Tasks();
                        /*     *******************************     */
                    } catch (Exception ex) {
                        System.out.print("Error: " + ex.toString());
                    }
                }
            }).start();
        }

    }
}
