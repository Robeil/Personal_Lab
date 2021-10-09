package Experiment.Personal_Lab;

import java.util.Scanner;

public class CountCharacter {

    public int countChar(String word) {
        int count = 0;

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'a') {
                count++;
            }

        }
        System.out.println(count);
        return count;
    }

    public static void main(String[] args) {

        System.out.println("Please enter any word.");
        Scanner input = new Scanner(System.in);
        String userInput = input.nextLine();

        CountCharacter checkOne = new CountCharacter();
        checkOne.countChar(userInput);
    }
}
