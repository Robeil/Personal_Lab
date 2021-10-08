package Experiment.Personal_Lab.Exam_Paper;
import java.util.Random;

public class Q_2 {
    public static void main(String[] args) {
    Random random = new Random();
    for(int i = 0; i < 10; i++){
        char grades = (char) (random.nextInt(4) + 'A');
        System.out.print(grades + " ");
    }
    }
}
