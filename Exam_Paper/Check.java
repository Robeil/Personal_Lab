package Experiment.Personal_Lab.Exam_Paper;

import java.util.Scanner;

public class Check {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num;

        boolean repeat = true;
        int sum = 0;

        do {
            System.out.println("Please enter any number");
            num = input.nextInt();
            if (num % 2 == 0) {
                System.out.println("Error: even number was entered.");
                repeat = false;
            } else if (num == 0) {
                System.out.println("Sum = " + sum);
                repeat = false;
            } else {
                sum += num;
                if (sum > 1000) {
                    System.out.println("Sum become larger than 1000");
                    repeat = false;
                }
            }
        } while (repeat);

    }
}
