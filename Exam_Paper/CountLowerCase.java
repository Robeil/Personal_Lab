package Experiment.Personal_Lab.Exam_Paper;

import java.util.Scanner;

public class CountLowerCase {
    public int countLower(String word){
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if(word.charAt(i) >= 'a' && word.charAt(i) <= 'z'){
                count++;
            }

        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println("Please enter any words");
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        CountLowerCase checkOne = new CountLowerCase();
        checkOne.countLower(word);
    }
}
