package basics.Algorithms.BinarySearch.Questions;

public class checkCeiling {
    public static void main(String[] args) {
       int[] arr = {4,5,6,7,8,9,12,67,99};
       int target = 11;

        System.out.println(ceilingValue(arr , target));
    }

    static int ceilingValue(int[] arr , int target){
        int start = 0;
        int end = arr.length-1;
if(target > arr[end]){
    return -1;
}
        while (start <=end){
            int middle = start+(end-start)/2;
            if(target > arr[middle]){
                start = middle+1;
            }else{
                end = middle-1;
            }
        }
        return arr[start];
    }
}
