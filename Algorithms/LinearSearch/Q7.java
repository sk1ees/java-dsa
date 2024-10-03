package basics.Algorithms.LinearSearch;

import java.util.Arrays;

public class Q7 {
    public static void main(String[] args) {
        int[][]arr = {
                {1,5},
                {7,3},
                {3,5},
        };

        System.out.println(richestPerson(arr));
    }

    static int richestPerson(int[][]arr){
        int[]tempArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                tempArr[i] += arr[i][j];
            }
        }

       int result =  maxNum(tempArr);
        return result;

    }

    static int maxNum(int[] arr){
        int highest = arr[0];
        for(int num: arr){
            if(num > highest){
                highest = num;
            }
        }
        return highest;
    }
}
