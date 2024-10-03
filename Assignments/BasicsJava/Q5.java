package basics.Assignments.BasicsJava;

import java.util.Scanner;

//take 2 numbers as input and print the largest number.
public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if(num1 > num2){
            System.out.println(num1 + " is the greatest!");
        }else{
            System.out.println(num2 + " is the greatest");
        }
    }
}
