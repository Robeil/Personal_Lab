package Experiment.Personal_Lab;

import java.util.Scanner;

public class trimSpace {
    public static void main(String[] args) {
        System.out.println("Please enter any word");
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        int counter = 0;

        for(int i = 0; i < word.length(); i++){

           if(word.trim().length() == ' '){
               counter++;
           }

        }
        System.out.println("There are " + counter + " words here.");
    }
}
