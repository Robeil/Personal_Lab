package Experiment.Personal_Lab.Array;

public class SortingOddEven {
    public static int[] sorting(int[] number, int[] copy){
        int j = 0;
        int k = number.length - 1;
        for(int i = 0; i < number.length; i++){
            if(i % 2 == 0){
                copy[j++] = number[i];
            } else{
                copy[k--] = number[i];
            }
        }
        return  copy;
    }

    public static void main(String[] args) {
        int[] number = {1, 2, 4, 5, 7, 9, -2, 3,6,8};
        int[] copy = new int[number.length];

        int[] sorted = sorting(number, copy);

        for(int i: sorted){
            System.out.print(i + " ");
        }
    }
}
