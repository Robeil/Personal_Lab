package Experiment.Personal_Lab;

import java.util.Random;

public class PasswordGenerator {

    public void genPass() {

        Random random = new Random();
        char lowerCase = ((char) (random.nextInt(26) + 65));
        char upperCase = ((char) (random.nextInt(26) + 97));
        int number = (random.nextInt(9));
        char character = ((char) (random.nextInt(6) + 33));
        String newPassword = upperCase + " " + lowerCase + " " + number + " " + character;
        System.out.print(newPassword);

    }

    public static void main(String[] args) {
        PasswordGenerator newPass = new PasswordGenerator();
        newPass.genPass();
    }

}
