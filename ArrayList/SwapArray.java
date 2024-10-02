package basics.ArrayList;

import java.util.Arrays;

public class SwapArray {
    public static void main(String[] args) {


        int[] arr = {1, 2, 3, 4, 5};

       swap(arr, 1,2);

        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr1 , int index1 , int index2){

        int temp = arr1[index1];
        arr1[index1] = arr1[index2];
        arr1[index2] = temp;

    }
}
