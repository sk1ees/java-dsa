package basics.Assignments.BasicsJava;

import java.util.Scanner;
//Write a program to print whether a number is even or odd, also take input from the user.

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        if(number%2 == 0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
    }
}
