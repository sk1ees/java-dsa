package basics.Algorithms.LinearSearch;

import java.util.Arrays;

public class Q4 {
    public static void main(String[] args) {
        int[][] arr = {
                {34,56,78},
                {87,78,39},
                {12,9,1},
        };
int target = 89;
        System.out.println(minValue(arr));
    }
    static int minValue(int[][]arr){
        int maximum = Integer.MIN_VALUE;
     for(int[] arr1: arr){
         for(int num: arr1){
             if(num > maximum){
                 maximum = num;
             }
         }
     }
        return maximum;
    }
}
