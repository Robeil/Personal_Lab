package Experiment.Personal_Lab.Array;

import java.util.Scanner;

public class Occurrences {
    public static void main(String[] args) {

        System.out.println("Enter any number");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int[] newArray = new int[num];
        int zero = 0, one = 0, two = 0,three = 0,four = 0, five = 0, six = 0, seven = 0, eight = 0, nine = 0;
        for(int i = 0; i < num; i++){
           newArray[i] = input.nextInt();
        }

        for(int i = 0; i < newArray.length; i++){
            if(newArray[i] == '0'){
                zero++;
            } else if(newArray[i] == '1'){
                one++;
            }else if(newArray[i] == '2'){
                two++;
            }else if(newArray[i] == '3'){
                three++;
            } else if(newArray[i] == '4'){
                four++;
            } else if(newArray[i] == '5'){
                five++;
            } else if(newArray[i] == '6'){
                six++;
            }else if(newArray[i] == '7'){
                seven++;
            }else if(newArray[i] == '8'){
               eight++;
            }else if(newArray[i] == '9'){
                nine++;
            }
        }
        System.out.println(zero +"\n"+ one +"\n"+ two +"\n"+ three +"\n"+ four + "\n"+five + "\n"+six + "\n"+seven +"\n"+ eight + "\n"+nine );
    }
}
