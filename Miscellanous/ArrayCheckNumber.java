package basics.Miscellanous;

import java.util.Scanner;

public class ArrayCheckNumber {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array Length: ");
        int arrLength = sc.nextInt();
        int arr[] = new int[arrLength];
        System.out.println("Enter the value of Arrays:");
        for(int i = 0 ; i<arrLength;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the number you want to find: ");
        int key = sc.nextInt();

        for(int i = arrLength-1; i>=0 ; i--){
            if(arr[i] == key){
                System.out.println(String.format("The number is in the index number: %d",i));
                break;
            }
        }


    }
}
