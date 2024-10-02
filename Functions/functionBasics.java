package basics.Functions;

import java.util.Scanner;

public class functionBasics {
    static void add(int a , int b){
        System.out.println(a+b);
    }
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int num1 = sc.nextInt();
    int num2 = sc.nextInt();

        add(num1 , num2);

    }
}
