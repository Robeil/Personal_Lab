package Experiment.Personal_Lab;

import java.util.Random;
import java.util.Scanner;

public class RockScissorPaper {

    public void RSP(String rsp) {

        Random random = new Random();
        Scanner input = new Scanner(System.in);


        while (true) {
            int rand = random.nextInt(3);
            if (rand == 0)
                System.out.println("Rock");
             else if (rand == 1)
                System.out.println("Scissors");
             else
                System.out.println("Paper");


                System.out.println("Write stop to quit the game");
                String answer = input.next();
                if (answer.equalsIgnoreCase("Stop"))
                    break;
        }
    }






    public static void main(String[] args) {

        System.out.println("Please enter your input");
        Scanner input = new Scanner(System.in);
        String userInput = input.next();

        RockScissorPaper game1 = new RockScissorPaper();
        game1.RSP(userInput);
    }
}
