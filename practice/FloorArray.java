package basics.practice;

public class FloorArray {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5,6,7,9};
        int target = 8;
        System.out.println(bSearch(arr ,target));
    }
    static int bSearch(int[] arr , int target){
        int start = 0;
        int end = arr.length-1;

        while(start<=end){

            int middle = start+(end-start)/2;

            if(target > arr[middle]){
                start = middle+1;
            }else if(target < arr[middle]){
                end = middle-1;
            }else{
                return  middle;
            }
        }
        return  end;
    }
}
