package Experiment.Personal_Lab.Recrsion;

import java.util.Scanner;

public class Sample {
    public static void main(String[] args) {
       System.out.println("How many times you want to say Hello World ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        HelloWorld(num);
    }

   public static void HelloWorld(int num) {

       if (num > 0) {
           System.out.println("Hello World! " + num);
           num--;
           HelloWorld(num);
       }
   }
}
