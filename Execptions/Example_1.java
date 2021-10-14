package Experiment.Personal_Lab.Execptions;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class Example_1 {
    public static void main(String[] args) {
        GregorianCalendar today = new GregorianCalendar();

        System.out.println("Please enter any number");
        Scanner input = new Scanner(System.in);

        try{
            int num = input.nextInt();
            System.out.println(num);
        } catch(Exception e){
            System.out.println("Wrong input");
        }

    }
}
