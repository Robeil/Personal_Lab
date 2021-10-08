package Experiment.Personal_Lab;

public class Regex {
    public static void main(String[] args) {
        String name = "P123";
        int num = 12355;
        System.out.println(name.matches("P[0-9]+"));
    }
}
