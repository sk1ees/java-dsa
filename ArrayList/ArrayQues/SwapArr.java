package basics.ArrayList.ArrayQues;

import java.util.ArrayList;
import java.util.Arrays;

public class SwapArr {
    public static void main(String[] args) {
//
//        int[] arr = {1,2,3,4,5};
//
//        swap(arr , 1,2);

        ArrayList <Integer> list = new ArrayList<>(5);

        list.add(23);
        list.add(89);
        list.add(34);
        list.add(54);
        list.add(12);
//swap index-2 and index-3
        int temp = list.get(2);
        list.set(2 , list.get(3));
        list.set(3,temp);
        System.out.println(list);

    }
//    static void swap(int[] arr1 ,int index1 , int  index2){
//        int temp = arr1[index1];
//        arr1[index1] = arr1[index2];
//        arr1[index2] = temp;
//        System.out.println(Arrays.toString(arr1));
//    }
}
