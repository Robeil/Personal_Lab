package Experiment.Personal_Lab.Exam_Paper;

public class Q_4 {

    public void printPriceCategory(int price) {
        if (price <= 70000) {
            System.out.println("Low");
        } else if (price > 70000 && price <= 220000) {
            System.out.println("Medium");
        } else {
            System.out.println("High");
        }
    }

    public static void main(String[] args) {
    Q_4 priceOne = new Q_4();
    priceOne.printPriceCategory(67000);
    }
}
