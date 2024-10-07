package basics.Algorithms.BinarySearch.Questions;

public class checkOc {
  //check the ceiling of a number


    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,7,8,9};

        int target = 1;

        System.out.println(searchCeiling(arr,target));
    }

    static int searchCeiling(int[] arr , int target){

        return binarySearch(arr, target);
    }

    static int binarySearch(int[] arr, int target){

        int start = 0 ;
        int end = arr.length-1;

        while(start <= end){

            int middle = start+(end-start)/2;


            if(target > arr[middle]){
                start = middle+1;
            }else if(target<arr[middle]){
                end = end-1;
            }else{
                return arr[end];
            }
        }
        return -1;
    }
}
