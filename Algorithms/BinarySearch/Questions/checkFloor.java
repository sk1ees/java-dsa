package basics.Algorithms.BinarySearch.Questions;

public class checkFloor {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,8,9,12,67,99};
        int target = 4;

        System.out.println(floorValue(arr , target));
    }
    static int floorValue(int[] arr , int target){
        int start = 0;
        int end = arr.length-1;

        if(target<=arr[start]){
            return -1;
        }

        while(start<=end){
            int middle = start+(end-start)/2;
            if(target > arr[middle]){
                start = middle+1;
            }else{
                end = middle-1;
            }
        }
        return arr[end];
    }
}
