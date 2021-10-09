package Experiment.Personal_Lab.Exam_Paper;

public class Continue {
    public static void main(String[] args) {
        int x = 0;
        while(x < 10){
            if(x == 5){
               x++;
                continue;
            }
            System.out.print(x + " ");
            x++;
        }
    }
}
