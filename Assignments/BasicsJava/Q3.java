package basics.Assignments.BasicsJava;

import java.util.Scanner;

//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
public class Q3 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the principal: ");
        int principal = sc.nextInt();
        System.out.print("Enter the time: ");
        int time = sc.nextInt();
        System.out.print("Enter the rate: ");
        int rate = sc.nextInt();


        float SI = (principal * time * rate)/100;
        System.out.println(SI);
    }
}
