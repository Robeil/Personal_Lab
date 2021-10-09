package Experiment.Personal_Lab.Exam_Paper;

import java.util.Random;
import java.util.Scanner;

public class CoinToss {
    Random random = new Random();
    public void coinToss(int number){

        int toss = 1;
        for (int i = 0; i < number; i++) {
            toss = random.nextInt(3);
            if(toss == 0){
                System.out.println("Heads");
            }else {
                System.out.println("Tails");
            }

        }

    }

    public static void main(String[] args) {
        System.out.println("How many times do you want to throw it?");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        CoinToss throwOne = new CoinToss();
        throwOne.coinToss(number);
    }
}
