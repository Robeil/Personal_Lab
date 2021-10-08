package Experiment.Personal_Lab;

import java.util.Locale;
import java.util.Scanner;

public class Email {


    public void generateEmail(String firsName, String lastname){

        String email = firsName + lastname + "@miu.edu";
        System.out.println(email.toLowerCase());

    }
    public static void main(String[] args) {


        System.out.println("Please enter your first name and last name.");
        Scanner input = new Scanner(System.in);
        String firstName = input.next();
        String lastName = input.next();

        Email fistEmail = new Email();
        fistEmail.generateEmail(firstName, lastName);

    }

}
