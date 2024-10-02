package basics.homeworks;

import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int arraySize =  sc.nextInt();
        int[] arr = new int[arraySize];

        for(int i = 0 ; i<arraySize ; i++){
            arr[i] = sc.nextInt();
        }

        int max = 0;
        int min = arr[0];
        for(int num: arr){

            if(num>max) {
                max = num;
            }

            if(num < min){
                min = num;

            }        }
        System.out.println(max);
        System.out.println(min);

    }
}
