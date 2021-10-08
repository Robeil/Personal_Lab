package Experiment.Personal_Lab.Exam_Paper;

import java.util.Random;

public class Q_3 {

    Random random = new Random();

    public void genPass(){
        char charA = (char) (random.nextInt(26) + 65);
        char chara = (char) (random.nextInt(26) + 97);
        int charN = random.nextInt(9);
        char character = (char) (random.nextInt(6) + 33);
        System.out.println(charA +" "+ chara+" "+charN+" "+character);
    }
    public static void main(String[] args) {
        Q_3 special = new Q_3();
        special.genPass();
    }
}
