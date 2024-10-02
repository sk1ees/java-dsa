package basics.Miscellanous;

import java.util.Scanner;

public class SumOfPositiveNumbers {
    public static void main(String[] args){
        int inputNumber;
        int number = 0 ;
        Scanner sc = new Scanner(System.in);
        do{
            inputNumber = sc.nextInt();
            if(inputNumber > 0 ){
                number += inputNumber;
            }


        }while(inputNumber > 0);
        System.out.println(number);
    }
}
