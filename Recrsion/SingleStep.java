package Experiment.Personal_Lab.Recrsion;

import java.util.Scanner;

public class SingleStep {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("How far do you want to walk?");
        int distance = input.nextInt();

        takeAStep(0, distance);

    }

    public static void takeAStep(int i, int distance){

        if(i < distance){
            i++;
            System.out.println("You take a step " + i +" meter/s");
            takeAStep(i, distance);
        } else{
            System.out.println("You done walking.");
        }
    }
}
