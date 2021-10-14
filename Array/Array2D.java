package Experiment.Personal_Lab.Array;

public class Array2D {
    public static void main(String[] args) {

        int[] [] integers = { {3,5,7},{10,2,9} };

        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 2; j++) {
                System.out.print(integers[j][i] + " ");

            }
            System.out.println("");
        }
    }

}
