package basics.practice;

import java.util.Arrays;

public class FirstLast {

    public static void main(String[] args) {
        int[] arr = {2,2,2,2,2,2,2,2};
        int target = 2;

        System.out.println(Arrays.toString(searchOcc(arr ,target)));
    }

    static int[] searchOcc(int[] arr ,int target ){
        int[] ans = {-1,-1};

        ans[0] = bSearch(arr , target , true);
        ans[1] = bSearch(arr , target , false);
        return ans;
    }

    static int bSearch(int[] arr , int target , boolean FindFirst){
        int start = 0;
        int end = arr.length-1;
        int ans = -1;
        while(start<=end){

            int middle = start+(end-start)/2;

            if(target > arr[middle]){
                start = middle+1;
            }else if(target < arr[middle]){
                end = middle-1;
            }else{
               if(FindFirst){
                   ans = middle;
                   end = middle-1;
               }else{
                   ans = middle;
                   start = middle+1;
               }

            }
        }
        return ans;
    }
}
