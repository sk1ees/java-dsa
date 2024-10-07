package basics.Algorithms.BinarySearch.Questions;

public class RotationArray {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int target = 2;

        System.out.println(search(arr , target));
    }
    static int search(int[] arr , int target){
        int peak = searchPeak(arr);
        int result = agnosticBS(arr , target , 0 , peak );
        if(result != -1){
            return result;
        }else{
            return agnosticBS(arr , target , peak+1 , arr.length-1);
        }
    }

    static int searchPeak(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {

            int middle = start+(end-start)/2;

            if(arr[middle] > arr[middle+1]){
                end = middle;
            }else{
                start = middle+1;
            }
        }
        return start;
    }

    static int agnosticBS(int[]arr , int target , int start , int end ){

        boolean isAsc = arr[start] < arr[end];
        while(start<=end){
            int middle = start+(end-start)/2;
//            System.out.println( middle);
            if(target == arr[middle]){
                return middle;
            }

            if(isAsc){
                if(target < arr[middle]){
                    end = middle -1;
                }else{
                    start = middle+1;
                }
            }else{
                if(target > arr[middle]){
                    end = middle -1;
                }else{
                    start = middle+1;
                }
            }
        }

        return -1;
    }
}
