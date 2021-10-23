package Experiment.Personal_Lab.Array;

public class ModifierOddSum {


    public static void copyArray(int[] number, int[] temp) {

        int j = 0;
        int k = number.length - 1;
        for (int i = 0; i < number.length; i++) {
            if (i % 2 != 0) {
                temp[j++] = number[i];
            } else {
                temp[k--] = number[i];
            }
        }
    }

    public static void main(String[] args) {

        int[] number = {1, 2, 4, 5, 7, 9, -2, 3};
        int[] temp = new int[number.length];


    }
}
