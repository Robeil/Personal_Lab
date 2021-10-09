package Experiment.Personal_Lab.Exam_Paper;

public class Test {
    public static void doubleTheInput(int x, int y) {
        x = 2 * x;
        y = 2 * y;
    }

    public static void main(String[] args) {


        int x = 5;
        int y = 6;
        Test.doubleTheInput(x,y);
        System.out.println(x);
        System.out.println(y);
    }
}
