package Experiment.Personal_Lab.Exam_Paper;

import java.util.Scanner;

public class CalculatorTable {

    public void createTable(int number){
        for(int i = 1; i < number; i++){
            for(int j = 1; j < number; j++){
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("Please enter any number.");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

       CalculatorTable tableOne = new CalculatorTable();
       tableOne.createTable(number);
    }
}
