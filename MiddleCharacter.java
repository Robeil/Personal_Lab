package Experiment.Personal_Lab;

import java.util.Scanner;

public class MiddleCharacter {
    public static void main(String[] args) {
        System.out.println("Please enter any word");
        Scanner input = new Scanner(System.in);
        String word = input.next();
       int middleCharLength = word.length()/2;
       char middleChar = word.charAt(middleCharLength);
        System.out.println(middleChar);

    }
}
