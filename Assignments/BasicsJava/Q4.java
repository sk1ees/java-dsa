package basics.Assignments.BasicsJava;

//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        String operator = sc.next();
        int num2 = sc.nextInt();


        if(operator.equals("*")){
            System.out.println(num1 * num2);
        }else if(operator.equals("+")){
            System.out.println(num1+ num2);
        }else if(operator.equals("/")){
            System.out.println(num1/num2);
        }else if(operator.equals("-")){
            System.out.println(num1 - num2);
        }else{
            System.out.println("operator does not exist!");
        }

    }
}
