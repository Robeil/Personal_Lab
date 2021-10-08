package Experiment.Personal_Lab.Exam_Paper;

import java.util.Scanner;

public class Q_6 {

    public void emailGenerator(String firstName,String lastName){

        String email = firstName.charAt(0) + lastName + "@miu.edu";
        System.out.println(email.toLowerCase());
    }
    public static void main(String[] args) {
        System.out.println("please enter your first name and last name.");
        Scanner input = new Scanner(System.in);
        String firstName = input.next();
        String lastName = input.next();

    Q_6 student = new Q_6();
    student.emailGenerator(firstName, lastName);
    }
}
