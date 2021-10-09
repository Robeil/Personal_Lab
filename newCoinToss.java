package Experiment.Personal_Lab;

import java.util.Random;
import java.util.Scanner;

public class newCoinToss {
    public static void main(String[] args) {
        Random random = new Random();

        System.out.println("how many toss do you want?");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int toss = 0;
        int h = 0;
        int t = 0;
        for(int i = 0; i < number; i++){
           toss = random.nextInt(2);

            if(toss == 0){
                System.out.println("H");
                h++;
            } else {
                System.out.println("T");
                t++;
            }

        }

        if(h > t){
            System.out.println("Head win");
        } else {
            System.out.println("Tail win");
        }


        for (int i = 0; i < number; i++) {
            for(int j = 0;  j< i; j++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
