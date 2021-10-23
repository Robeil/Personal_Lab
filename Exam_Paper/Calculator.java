package Experiment.Personal_Lab.Exam_Paper;

import java.util.Scanner;

public class Calculator {
    public static void calculator(int raw, int column){

        for (int i = 1; i <= raw; i++) {
            for (int j = 1; j <= column; j++) {
                System.out.print( i * j + "\t ");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the length of raw.");
        int raw = input.nextInt();
        System.out.println("Please enter the length of column.");
        int column = input.nextInt();

        calculator(raw, column);
    }
}
