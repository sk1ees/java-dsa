package basics.Algorithms.BinarySearch.Questions;

import java.util.Arrays;

public class checkPosition {
    public static void main(String[] args) {
        int[] arr = {5, 7, 7, 7, 7, 8, 8, 10};

        int target = 8;
        System.out.println(Arrays.toString(checkPos(arr, target)));
    }

    static int[] checkPos(int[] arr, int target) {
        int start = search(arr, target, true);
        int last = search(arr, target, false);
        int[] ans = {-1, -1};
        ans[0] = start;
        ans[1] = last;
        return ans;
    }

    static int search(int[] arr , int target , boolean isStart){
        int ans = -1;
        int start = 0 ;
        int end = arr.length-1;

        while(start<=end){
            int middle = start+(end-start)/2;
            if (target > arr[middle]) {
                start = middle+1;
            }else if(target < arr[middle]){
                end = middle-1;
            }else{
                if(isStart){
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

