package basics.practice;

public class CeilingArray {
    public static void main(String[] args) {
        int[] arr = {9,7,6,5,4,3,0};
        int target = 8;
        System.out.println(search(arr ,target));
    }
    static int search(int[] arr , int target){
        if(arr[0] < arr[arr.length-1]){
            return bSearch(arr, target , true);
        }else{
            return bSearch(arr, target , false);
        }
    }

    static int bSearch(int[] arr , int target , boolean isAsc){
        int start = 0;
        int end = arr.length-1;

        while(start<=end){

            int middle = start+(end-start)/2;

            if(isAsc){
                if(target > arr[middle]){
                    start = middle+1;
                }else if(target < arr[middle]){
                    end = middle-1;
                }else{
                    return  middle;
                }
            }else{
                if(target > arr[middle]){
                    end = middle-1;
                }else if(target < arr[middle]){
                    start   = middle+1;
                }else{
                    return  middle;
                }
            }
        }
        return  start;
    }
}
