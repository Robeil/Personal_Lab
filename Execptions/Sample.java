package Experiment.Personal_Lab.Execptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Sample {
    public static void main(String[] args) {
        System.out.println("Please enter any number.");
        Scanner input = new Scanner(System.in);
        int userInput;

        try {
            userInput = input.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Invalid Entry please try again");
            //System.out.println(e.printStackTrace());
        }
        try {
            userInput = input.nextInt();


            FileReader f = new FileReader("filename.txt");
        } catch (InputMismatchException e) {

        } catch (FileNotFoundException e) {

        }


    }
}
