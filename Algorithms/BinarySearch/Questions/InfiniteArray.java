package basics.Algorithms.BinarySearch.Questions;

import java.util.Arrays;

public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};

        int target = 4;

        System.out.println(searchIndex(arr , target));
    }

    static int searchIndex(int[] arr , int target){

        int start = 0;
        int end = 1;

        while(target > arr[end]){

            int temp = end+1;
            end = end+(end-start+1)*2;
            start = temp;


        }
        return binarySearch(arr,target ,start,end);
    }
    static int binarySearch(int[]arr , int target , int start , int end){

        while(start <=end){
            int middle = start+(end-start)/2;

            if(target > arr[middle]){
                start  = middle+1;
            }else if(target < arr[middle]){
                end = middle -1;
            }else{
                return middle;
            }
        }
        return -1;
    }
}
