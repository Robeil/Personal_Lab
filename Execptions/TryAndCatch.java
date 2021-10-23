package Experiment.Personal_Lab.Execptions;

import java.util.Scanner;

public class TryAndCatch {

    public static void main(String[] args) {

        System.out.println("Hey there, Please enter only number");
        Scanner input = new Scanner(System.in);

        try{

            int number = input.nextInt();
            System.out.println(number);

        } catch (Throwable e){
            System.out.println(e.getMessage());

        }
    }
}
