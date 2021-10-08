package Experiment.Personal_Lab.Exam_Paper;

public class While_Loop {
    public static void main(String[] args) {
        int i = 11;
        int number = 1;
        int num = 11;
        int sum = 0;

        while (i < 20) {
            if (number < 10) {
                sum = i + number;
                number++;
            }
           i++;
        }
        System.out.println(sum);
    }
}
