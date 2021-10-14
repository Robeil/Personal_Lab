package Experiment.Personal_Lab.Array;

import java.util.Scanner;

public class SPA_Array {

    public static void main(String[] args) {
        System.out.println("Please enter your array length");
        Scanner input = new Scanner(System.in);
        int length = input.nextInt();

        int[] newValues = new int[length];
        int sum = 0;
        int product = 1;
        int average = 0;
        for(int i = 0; i < length; i++){
            newValues[i] += input.nextInt();
            sum += newValues[i];
            product += newValues[i];

        }
        average = sum / newValues.length;
        System.out.println("Sum is " + sum + " Product " + product + " Average " + average);
    }
}
