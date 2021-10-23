package Experiment.Personal_Lab.Final_Experment;

public class FirstFile {

    public static double[] sumEveryColumn(double[][] pay) {

        double[] sumColumn = new double[pay.length];
        double sum;
        for (int i = 0; i < pay.length; i++) {
            sum = 0.0;
            for (int j = 0; j < pay[i].length; j++) {
                sum += pay[i][j];
            }
            sumColumn[i] = sum;
        }
        return sumColumn;
    }

    public static void main(String[] args) {

        double[][] pay = {
                {10.50, 12.00, 14.50, 16.75, 18.00},
                {34.00, 36.50, 38.00, 40.35, 43.00},
                {50.00, 60.00, 70.00, 80.00, 99.99},
                {20.50, 22.25, 24.00, 26.25, 28.00},
        };
        double[] sum = sumEveryColumn(pay);
        for (double s : sum) {
            System.out.print(s + " ");
        }
    }
}
