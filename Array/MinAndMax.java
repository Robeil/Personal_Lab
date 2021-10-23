package Experiment.Personal_Lab.Array;

public class MinAndMax {

    public static double minimum(double[][] arr){

        double min = arr[0][0];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                if(arr[i][j] < min){
                    min = arr[i][j];
                }
            }
        }
        return min;
    }

    public static double maximum(double[][] arr){

        double max = arr[0][0];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                if(arr[i][j] > max){
                    max = arr[i][j];
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        double[][] payScaleTable = {
                {10.50, 12.00, 14.50, 16.75, 18.00},
                {20.50, 22.25, 24.00, 26.25, 28.00},
                {34.00, 36.50, 38.00, 40.35, 43.00},
                {50.00, 60.00, 70.00, 80.00, 99.99}
        };
        System.out.println(minimum(payScaleTable));
        System.out.println(maximum(payScaleTable));
    }
}
