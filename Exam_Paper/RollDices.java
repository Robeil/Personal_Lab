package Experiment.Personal_Lab.Exam_Paper;

import java.util.Random;
import java.util.Scanner;

public class RollDices {
    Random random = new Random();

    public void roll(int number) {

        for (int i = 0; i < number; i++) {
            int roll1 = (int) (random.nextInt(number) + 1);
            int roll2 = (int) (random.nextInt(number) + 1);
            System.out.print("( " +roll1 + "," + roll2+ " )");
        }

    }

    public static void main(String[] args) {
        System.out.println("Please enter number of dices.");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        RollDices firstRoll = new RollDices();
        firstRoll.roll(number);

    }
}
