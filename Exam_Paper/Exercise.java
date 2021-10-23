package Experiment.Personal_Lab.Exam_Paper;

import java.util.Scanner;

public class Exercise {

    public static void main(String[] args) {

        System.out.println("Please enter any number");
        Scanner userInput = new Scanner(System.in);
        int number = userInput.nextInt();

        boolean isPositive = number > 0;

        if(isPositive){
            System.out.println("You entered a positive number.");
        } else {
            System.out.println("You entered a negative number.");
        }
    }
}
