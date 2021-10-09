package Experiment.Personal_Lab.Exam_Paper;

import java.util.Scanner;

public class ReviewMidterm {
    public static void main(String[] args) {
//        String s = new String("fpp");
//        String t = s;
//        String x = new String("fpp");
//        System.out.println(s.equals(t));
//        System.out.println(s==t);
//        System.out.println(s.equals(x));
//        System.out.println(s==x);

//        int a = 39;
//        int b = 9;
//        int result = (a % 20)/b;
//        System.out.println(result);

//localDate date = new localDate("March 19, 2012");
//        int b = 2;
//        int c = 2;
//        int result = (int) Math.sqrt(b + Math.pow(c, 5));
//        System.out.println(result);

//        String word1 = "hello";
//        String word2 = word1.replace('e','a');
//        System.out.println(word1);
//        System.out.println(word2);
//        String s = "elephant";
//        System.out.println(s.substring(2,7));

//localDate year = new localDate("March 19, 2012");
        System.out.println("please enter any number");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        ReviewMidterm testOne = new ReviewMidterm();
        testOne.sumOdd(number);
    }
    public int sumOdd(int number) {
        int sum = 0;
        if (number > 0) {
            for (int i = 1; i <= number; i += 2){
                sum += i;
                System.out.print(i + " ");
            }
            System.out.print(sum);
        }
        return sum;
    }
}
