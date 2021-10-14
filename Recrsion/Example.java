package Experiment.Personal_Lab.Recrsion;

import java.util.Scanner;

public class Example {

    public static int factorial(int num) {

        if (num == 1) {
            return 1;
        } else {
            System.out.println(num);
            return num * factorial(num - 1);

        }
    }

    public static void main(String[] args) {
        System.out.println("Please enter any number.");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        System.out.println(factorial(num));

    }
}
