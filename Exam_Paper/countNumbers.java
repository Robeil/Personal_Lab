package Experiment.Personal_Lab.Exam_Paper;

import java.util.Scanner;

public class countNumbers {
    public static void main(String[] args) {
        System.out.println("Please enter any word");
        Scanner input = new Scanner(System.in);
        String word = input.next();

//        int counter = 0;
//        for (int i = 0; i < word.length(); i++) {
//            if (Character.isDigit(word.charAt(i))) {
//                counter++;
//
//            }
//        }
//        System.out.println(counter);
        int counter = 1;
        for(int i = 0; i < word.length(); i++){
            if(word.charAt(i) >= 'A' && word.charAt(i) <= 'Z'){
                counter++;
            }
        }
        System.out.println(counter);
    }
}
