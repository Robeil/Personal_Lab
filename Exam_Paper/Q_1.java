package Experiment.Personal_Lab.Exam_Paper;

import java.util.Scanner;

public class Q_1 {
    public static void main(String[] args) {

        System.out.println("Please enter your first name and last name.");
        Scanner userInput = new Scanner(System.in);
        String firstName = userInput.next();
        String lastName = userInput.next();
        String email = firstName.charAt(0) + lastName + "@miu.edu";
        System.out.println(email);

    }
}
