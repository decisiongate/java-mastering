package mastering;

import javax.swing.*;
import java.io.*;
import java.util.Scanner;

public class MainApp {

    private static String[] classIndex = new String[]{
            "String Calculator", "Arrays Methods", "Operators", "Lambdas" };

    public static void main(String[] args) {

        for(int i=0; i<classIndex.length; i++) System.out.println((i+1) + ". " + classIndex[i]);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Select menu option: ");
        int menuOption = scanner.nextInt();
        System.out.println("Selected menu option: " + menuOption);
        menuOption--;

        if(classIndex[menuOption].equals("String Calculator")) { new Thread(new Runnable() {
            @Override public void run() { try {
                StringCalculator stringCalc = new StringCalculator();
                stringCalc.stringCalcutatorTask();
            } catch (Exception ex) { System.out.print("Error: " + ex.toString()); }}}).start();}

        if(classIndex[menuOption].equals("Arrays Methods")) { new Thread(new Runnable() {
            @Override public void run() { try {
                ArraysMethods arraysMethods = new ArraysMethods();
                arraysMethods.Tasks();
            } catch (Exception ex) { System.out.print("Error: " + ex.toString()); }}}).start();}

        if(classIndex[menuOption].equals("Operators")) { new Thread(new Runnable() {
            @Override public void run() { try {
                Operators operators = new Operators();
                operators.Tasks();
            } catch (Exception ex) { System.out.print("Error: " + ex.toString()); }}}).start();}

        if(classIndex[menuOption].equals("Lambdas")) { new Thread(new Runnable() {
            @Override public void run() { try {
                Lambdas lambdas = new Lambdas();
                lambdas.Tasks();
            } catch (Exception ex) { System.out.print("Error: " + ex.toString()); }}}).start();}


    }
}
