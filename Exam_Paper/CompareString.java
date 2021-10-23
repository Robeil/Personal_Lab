package Experiment.Personal_Lab.Exam_Paper;

import java.util.Scanner;

public class CompareString {

    // public boolean compare(String name1, String name2) {
    public static void main(String[] args) {
        System.out.println("Please enter your full name");
        Scanner input = new Scanner(System.in);
        String name1 = input.nextLine();
        String name2 = input.nextLine();

        int length1 = name1.indexOf(' ');
        int length2 = name2.indexOf(' ');
        String lastName1 = name1.substring(length1, name1.length());
        String lastName2 = name2.substring(length2, name2.length());

        System.out.println(lastName1);
        System.out.println(lastName2);
        if (lastName1.equals(lastName2)) {
            System.out.println("They are sibling");
        } else {
            System.out.println("They are not ");
        }

        //   return  lastName1.equals(lastName2);

        // }


//
//        CompareString person = new CompareString();
//        person.compare(name1, name2);

    }
}
