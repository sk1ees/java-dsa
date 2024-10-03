package basics.Assignments.BasicsJava;

import java.util.Scanner;

//Input currency in rupees and output in USD.
public class Q6 {
    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);
        double rupees = sc.nextInt();


        double usd = 0.012 * rupees;

        System.out.println(usd);
    }
}
