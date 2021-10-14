package Experiment.Personal_Lab.Array;

import java.util.Scanner;

public class Sample1 {

    public static void fillArrays(int[] filledArray) {

        Scanner input = new Scanner(System.in);
        int array = input.nextInt();


        for (int i = 0; i < array; i++) {
            filledArray[i] += input.nextInt();
        }

    }

    public static void printArrays(int[] filledArray) {
        for (int i = 0; i < filledArray.length; i++) {

            //System.out.println(filledArray[i] + " ");
            System.out.println(filledArray.toString());
        }
       // System.out.println(Array.toString(filledArray));
    }

    public static void main(String[] args) {
        System.out.println("How many length do you want your array to be?");
        Scanner input = new Scanner(System.in);
        int arrayLength = input.nextInt();
        System.out.println("Please enter any number from 1 - 20");
        int array = input.nextInt();
        int[] filledArray = new int[arrayLength];


        while (arrayLength > 20 || arrayLength <= 0) {
            arrayLength = input.nextInt();
        }
        fillArrays(filledArray);
        printArrays(filledArray);

    }
}
