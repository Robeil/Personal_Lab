package Experiment.Personal_Lab;

import java.util.Scanner;

public class trySelf {
    public static void main(String[] args) {
        System.out.println("Please enter any number and i will tell you if it is prime or not");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        boolean isPrime = true;
        for (int i = 2; i < number / 2; i++) {
            if (number % 2 == 0) {
                isPrime = false;
            }
            System.out.println(number);
        }

        if (isPrime) {
            System.out.println("It is prime number");
        } else {
            System.out.println("It is not a prime number");
        }

    }
}
