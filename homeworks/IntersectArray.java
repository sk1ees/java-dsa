package basics.homeworks;

import java.util.Scanner;

public class IntersectArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array-1: ");
        int array1Size = sc.nextInt();
        int[] arr1 = new int[array1Size];
        System.out.println("Enter the values: ");
        for(int i = 0 ; i<array1Size;i++){
            arr1[i] = sc.nextInt();

        }

        System.out.println("Enter the size of Array-2: ");
        int array2Size = sc.nextInt();
        int[] arr2 = new int[array2Size];
        System.out.println("Enter the values: ");
        for(int i = 0 ; i<array2Size ; i++){
                arr2[i] = sc.nextInt();
        }
    int[] intersection = new int[Math.min(array1Size , array2Size)];
        int k = 0;

        for(int num: arr1){
            for(int num2: arr2){
                if(num == num2){
                intersection[k] = num;
                k++;
                }

            }

        }
        for(int i = 0 ; i<k ; i++){
            System.out.println(intersection[i]);
        }
    }
}
