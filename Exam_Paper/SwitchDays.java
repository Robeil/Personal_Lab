package Experiment.Personal_Lab.Exam_Paper;

import java.util.Scanner;

public class SwitchDays {

    public void printDays(int number){


        switch (number){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid input try again");
                break;
        }

    }

    public static void main(String[] args) {
        System.out.println("Please enter a number from 1 - 7 for days monday - fridays");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        SwitchDays days = new SwitchDays();
        days.printDays(num);
    }
}
