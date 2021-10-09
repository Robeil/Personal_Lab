package Experiment.Personal_Lab;

import java.util.Random;

public class MathRandom {
    public static void main(String[] args) {
        Random random = new Random();

        int ramNum = random.nextInt(6);
        System.out.println(ramNum);
        int max = 9;
        int min = 4;
        int randomNum = (int) (Math.random() * 11);
        System.out.println(randomNum);
    }
}
