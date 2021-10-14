package Experiment.Personal_Lab;

import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {


        int[] number = {1, 2, 3, 4};
        String[] name = {"Robeil", "Brhanemeskel", "Aregawi"};
        int[] num = new int[6]; //==> Array creation
        //double[] rainFall;

        System.out.println("Please enter the length of your array.");
        Scanner userInput = new Scanner(System.in);
        int input = userInput.nextInt();
        int[] rainFall = new int[input];
        double sum = 0.0;
        double average = 0.0;

        for(int i = 0; i < rainFall.length; i++){
            System.out.println("please enter your real values.");
            rainFall[i] += userInput.nextInt();
        }
        System.out.print("[ ");
        for(int i = 0; i < rainFall.length; i++){
            System.out.print(rainFall[i] + " ");
            sum += rainFall[i];
            average = sum / rainFall.length;
        }

        System.out.print(" ]");
        System.out.println("This is the sum " + sum);
        System.out.println("This is the average " + average);
    }
}
