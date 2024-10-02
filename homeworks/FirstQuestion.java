package basics.homeworks;

import java.util.Scanner;

public class FirstQuestion {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array");
        int arraySize = sc.nextInt();
        int[] arr = new int[arraySize];
        System.out.println("Enter the values :");
        for(int i = 0 ; i<arraySize; i++){
            arr[i] = sc.nextInt();
        }


        for(int num: arr){
            System.out.print(num*num + " ");
        }

    }
}
