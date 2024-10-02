package basics.Miscellanous;

import java.util.Scanner;

public class ArrayNumber {
    public static void main(String[] args){
//        int arr[] = new int[100];
//        arr[56] = 765;
//        System.out.println(arr[56]);



//        int arr[] = {1,2,3,4,5,65,7,8,9,23,45,56,78};


//        for(int i = 0 ; i<arr.length; i++){
//            System.out.print(arr[i]);
//            System.out.print(' ');
//        }

//        System.out.println(arr.length);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your array size: ");
       int n = sc.nextInt();

       int numSize[] = new int[n];


        for(int i = 0 ; i<numSize.length ; i++){
            System.out.println(String.format("Enter the value of arr[%d]",i));
            numSize[i] = sc.nextInt();

        }

        for(int i = 0 ; i<numSize.length ; i++){
            System.out.print(numSize[i]);
            System.out.print(" ");


        }



    }
}
