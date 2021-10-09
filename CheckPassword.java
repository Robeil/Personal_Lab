package Experiment.Personal_Lab;

import java.util.Scanner;

public class CheckPassword {
    public static void main(String[] args) {

        while(true){
            System.out.println("Please enter a password that has 8 character.");
            Scanner input = new Scanner(System.in);
           String phoneNumber = input.nextLine();

            if(phoneNumber.length() >= 8){
                System.out.println("Your password is saved");
                break;
            } else {
                System.out.println("Error: Invalid password.");

            }

        }
    }
}
