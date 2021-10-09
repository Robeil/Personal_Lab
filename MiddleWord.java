package Experiment.Personal_Lab;

import java.util.Scanner;

public class MiddleWord {
    public static void main(String[] args) {

        System.out.println("Please enter any sentence");
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();
        int count = 1;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ') {
                count++;
            }

        }
        System.out.println(count);


    }
}
