package Experiment.Personal_Lab;

import java.util.Scanner;

public class VowelsCheck {

    public void vowelCheck(String words){

        words.toLowerCase();
        int counter = 0;
        for(int i = 0; i < words.length(); i++){

            if(words.charAt(i) == 'a' || words.charAt(i) == 'e'|| words.charAt(i) == 'i' || words.charAt(i) == 'o' || words.charAt(i) == 'u'){
                counter++;
            }
        }
        System.out.println(counter);
    }
    public static void main(String[] args) {
        System.out.println("Please enter any words");
        Scanner userInput = new Scanner(System.in);
        String words = userInput.nextLine();

        VowelsCheck vowel = new VowelsCheck();
        vowel.vowelCheck(words);
    }
}
