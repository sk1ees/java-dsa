package basics.Algorithms.BinarySearch;

public class OrderAgnosticSearch {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int target = 9;

        System.out.println(agnosticBS(arr , target));
    }
    static int agnosticBS(int[]arr , int target){
        int start = 0 ;
        int end = arr.length-1;
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
