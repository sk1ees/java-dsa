package basics.Miscellanous;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many numbers you want to compare");
        int n = sc.nextInt();
        int largestNumber = Integer.MIN_VALUE;
        System.out.println(largestNumber);
        System.out.println("Enter the numbers");
        for(int i = 0 ; i < n ; i++ ){

            int number = sc.nextInt();
          largestNumber = Math.max(number , largestNumber);

        }
        System.out.println("The Largest Number is " + largestNumber);
    }
}
