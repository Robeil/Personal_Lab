package Experiment.Personal_Lab.Array;

public class Average {

    public static double[] average(double[][] arr, int column, int raw) {

        double average = 0.0;
        double sum = 0.0;
        double[] averageAll = new double[arr.length];
        double[] sumAll = new double[arr.length];

        for (int r = 0; r < arr.length; r++) {
            average = 0.0;
            sum = 0.0;
            for (int c = 0; c < arr[r].length; c++) {
                sum += arr[r][c];
            }
            sumAll[r] = sum;
            averageAll[r] = sum / arr.length;
        }
       // return sumAll;
        return averageAll;
    }

    public static void main(String[] args) {


        double[][] payScaleTable = {
                {10.50, 12.00, 14.50, 16.75, 18.00},
                {20.50, 22.25, 24.00, 26.25, 28.00},
                {34.00, 36.50, 38.00, 40.35, 43.00},
                {50.00, 60.00, 70.00, 80.00, 99.99}
        };
        int column = 2;
        int raw = 2;
        double[] together = average(payScaleTable, column, raw);
        for (double i : together) {
            System.out.print(i + " ");
        }
    }

}
