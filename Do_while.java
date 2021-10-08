package Experiment.Personal_Lab;

import java.util.Random;
import java.util.Scanner;

public class Do_while {

    public void do_while() {
        int sum = 0;
        int i = 0;
        do {
            if (i % 2 == 1) {
                sum += i + 1;

                System.out.print(i + " ");
            }
            i++;
        } while (i < 30);
        System.out.println("The sum is: " + sum + " " + i);
    }

    public void reWrite() {
        int count = 0;
        int sum = 0;
        do {
            sum += count;
            count++;
            System.out.print(count + " ");
        } while (count < 10);
        System.out.println("The sum is: " + sum);
    }

    public static void main(String[] args) {
        Do_while firstDo = new Do_while();
        firstDo.do_while();
        firstDo.reWrite();
    }

    public static class Assertion {

        private static final String DEFAULT_MESSAGE = "Your age: ";
        private Scanner scanner;

        public Assertion() {
            scanner = new Scanner(System.in);
        }

        public int getAge() {
            return getAge(DEFAULT_MESSAGE);
        }

        public int getAge(String prompt) {
            System.out.print(prompt);
            int age = scanner.nextInt();
            return age;
        }
    }

    public static class WhileLoop {

        public static void main(String[] args) {

            /*int number = 0;
            int sum = 0;

            while (number <= 100){
                sum+= number;
                number++;
            }
            System.out.println("The total sum is "+ sum);*/
            //sum of even number and odd number
            /*int oddSum = 0;
            int evenSum = 0;
            int num = 1;
            while (num < 1001) {
                oddSum = oddSum + num;
                evenSum = evenSum + (num + 1);
                num = num + 2;
            }

            System.out.println(oddSum);
            System.out.println(evenSum);*/

        }
    }

    public static class WhileIf {
        public static void main(String[] args) {

            //Make sure you understand this it could be in test
            int x = 0;
            while (x < 10) {

                if (x == 5) {
                    x++;
                    continue;
                }
                System.out.println(x);
                x++;
            }
        }
    }

    public static class LeapYear {

        public LeapYear() {

        }

        public static String findLeapYear(int year) {

            String outPut;

            if (year % 4 == 0 || year % 100 != 0) {

                outPut = year + " This is a Leap year.";
            } else {

                outPut = year + " This is not a Leap year sorry!";
            }
            return outPut;
        }

        public static void main(String[] args) {

            System.out.println("Please enter the year");
            Scanner yearInput = new Scanner(System.in);

            int year = yearInput.nextInt();
            LeapYear year1 = new LeapYear();
            System.out.println(LeapYear.findLeapYear(year));
        }

    }

    public static class Sample {
        public static void main(String[] args) {
            int a = 2, b = 4, c = 6, d = 8, x = 10, y = 12, z = 14;
            //if(a<b)x=y;if(a<c)x=z; else if( c < d ) z = y;

            if (a < b) {
                x = y;
            } else {
                if (a < c) {
                    x = z;
                } else if (c < d) {
                    z = y;
                }
            }
        }
    }

    public static class NestedLoop {

        static Random random = new Random();

        public NestedLoop() {
        }

        public void table() {
            int third = 0;
            int fourth = 0;
            for (int raw = 0; raw < 4; raw++) {

                for (int column = 0; column < 4; column++) {

                    //                third = random.nextInt(2) + 1;
                    //                fourth = random.nextInt(2) + 1;
                    //               System.out.print("(" + third + "," + fourth + ")");
                    System.out.print("(" + raw + "," + column + ")");
                }
                System.out.println();
            }

        }

        public static void main(String[] args) {

            NestedLoop tableOne = new NestedLoop();

            tableOne.table();
        }
    }

    public static class ExerciseIf {

        private String status;
        private double salary;
        private final double NORMAL_TAX = 0.1;
        private final double HIGH_TAX = 0.18;

        public ExerciseIf() {

        }

        public void calcTaxRate(String status, double salary) {

            double tax = 0;
            status.toLowerCase();

            if (status.equals("single")) {
                if (salary > 40000) {
                    System.out.println(HIGH_TAX);

                } else {
                    System.out.println(NORMAL_TAX);
                }

                if (status.equals("Married")) {
                    if (salary > 60000) {
                        System.out.println(HIGH_TAX);
                        ;

                    } else {
                        System.out.println(NORMAL_TAX);
                    }

                }
            }

        }

        public static void main(String[] args) {

            System.out.println("Please enter your martial status");
            Scanner checkStatus = new Scanner(System.in);
            String statusInput = checkStatus.next();
            double salaryInput = checkStatus.nextInt();

            ExerciseIf person1 = new ExerciseIf();

            person1.calcTaxRate(statusInput, salaryInput);

        }
    }

    public static class NestedIfTable {

        public void print() {
            int num = 10;
            for (int raw = 0; raw < 4; raw++) {

                for (int column = 0; column < 10; column++) {

                    System.out.print(num + " ");
                    num++;
                }

                System.out.println(" ");
            }
        }

        public static void main(String[] args) {

            //        System.out.println("Please enter a number");
            //        Scanner numberInput = new Scanner(System.in);
            //        int number = numberInput.nextInt();

            NestedIfTable newInput = new NestedIfTable();
            newInput.print();

        }
    }
}
