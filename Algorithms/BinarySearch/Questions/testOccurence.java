package basics.Algorithms.BinarySearch.Questions;

import java.util.Arrays;

public class testOccurence {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,5,5,5,5,7,8,9};
        int target = 5;

        System.out.println(Arrays.toString(searchIndex(arr , target)));
    }

    static int[] searchIndex(int[] arr , int target){
        int[] ans = {-1,-1};

        int start = searchBS(arr ,target ,true);
        int end = searchBS(arr , target , false);

        ans[0] = start;
        ans[1] =end;

        return ans;
    }
    static int  searchBS(int[] arr , int target , boolean FindFirstIndex){
        int ans = -1;
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int middle = start+(end-start)/2;

            if(target > arr[middle]){
                start = middle+1;
            }else if(target < arr[middle]){
                end = middle-1;
            }else{
                ans = middle;
                if(FindFirstIndex){
                    end = middle-1;
                }else{
                    start = middle+1;
                }

            }
        }
        return ans;


    }
}
