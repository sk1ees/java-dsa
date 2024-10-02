package basics.Array;

import java.util.Scanner;

public class Array2D {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int cols = sc.nextInt();
        System.out.println("Enter the input of the arr: ");
        int[][] arr = new int[rows][cols];
        for(int i = 0 ; i<arr.length ; i++){
            for(int j = 0 ; j<arr[i].length ; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Following output: ");
        for(int i = 0 ; i<arr.length ; i++){
            for(int j = 0 ; j<arr[i].length ; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }



    }
}
