package basics.Array;

import java.util.Scanner;

public class MatricesSum {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] a = new int[rows][cols];
        int[][] b = new int[rows][cols];


        //input for a 2dArray
        System.out.println("Enter the value of Array-1");
        for(int i = 0 ; i<rows ; i++){
            for(int j = 0 ; j<cols ; j++){
                a[i][j] = sc.nextInt();
            }
        }


        //input for b 2dArray
        System.out.println("Enter the value of Array-2");
        for(int i = 0 ; i<rows ; i++){
            for(int j = 0 ; j<cols ; j++){
                b[i][j] = sc.nextInt();
            }
        }


        //sum of both array
int[][] c = new int[rows][cols];
        System.out.println("Summation of the both Arrays");
        for(int i = 0 ; i<rows ; i++){
            for(int j = 0 ; j<cols ; j++){
                c[i][j] = a[i][j]+b[i][j];
            }
        }

        //printing the third Array

        for(int i = 0 ; i<rows ; i++){
            for(int j = 0 ; j<cols ; j++){
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }



    }
}
