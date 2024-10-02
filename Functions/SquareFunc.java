package basics.Functions;

import java.util.Scanner;

public class SquareFunc {
    static void squareFunc(int num){
        System.out.println(num*num);
    }



    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num  =sc.nextInt();
        squareFunc(num);
    }
}
