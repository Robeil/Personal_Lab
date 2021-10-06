package Experiment.Personal_Lab;

import java.util.Scanner;

public class Words {

    public void findWord(String sentence){

        int counter = 1;

        for(int i = 0; i < sentence.length(); i++){
            if(sentence.charAt(i) == ' '){
                counter++;
            }
        }
      System.out.println(counter);
    }

    public static void main(String[] args) {
        System.out.println("Please enter any sentence");
        Scanner sentenceInput = new Scanner(System.in);
        String sentence = sentenceInput.nextLine();

        Words find = new Words();
        find.findWord(sentence);
    }
}
