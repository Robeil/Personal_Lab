package Experiment.Personal_Lab;

public class Maximum {
    public static void main(String[] args) {

        int a = 2, b = 8, c = 5;
        int max = 0;
//        int res1 = Math.max(a,b);
//        int res2 = Math.max(res1, c);
//        int max = res2;
//
//        System.out.println(max);
//        if (a > b) {
//            if (a > c) {
//                max = a;
//                System.out.println(a);
//            } else {
//                max = c;
//                System.out.println(c);
//            }
//        } else {
//            max = b;
//            System.out.println(b);
//        }
        if(a > b && a > c){
            System.out.println(max = a);
        } else if(b > a && b > c){
            System.out.println(max = b);
        } else {
            System.out.println(max = c);
        }

    }
}
