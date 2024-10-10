package basics.Algorithms.BinarySearch.Questions;

public class PivotArray {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int target = 4;
        System.out.println(search(arr , target));
    }

   static int search(int[] arr , int target){


        int pivot = searchPivot(arr);


        if(pivot == -1){
            return binarySearch(arr , target,0 , arr.length-1);
        }
        if(target == arr[pivot]){
            return pivot;
        }

        if(target >= arr[0]){
            return binarySearch(arr, target , 0 , pivot-1);
        }else{
            return binarySearch(arr,target , pivot+1 , arr.length-1);
        }


   }

    static int binarySearch(int[]arr , int target , int start , int end){

        while(start <=end){
            int middle = start+(end-start)/2;

            if(target > arr[middle]){
                start  = middle+1;
            }else if(target < arr[middle]){
                end = middle -1;
            }else{
                return middle;
            }
        }
        return -1;
    }


    static int searchPivot(int[] arr){
        int start = 0;
        int end = arr.length-1;


        while(start<=end){
            int middle = start+(end-start)/2;


//            cases
            if(middle<end && arr[middle] > arr[middle+1]){
                return middle;
            }

            if(middle > start && arr[middle] < arr[middle-1]){
                return middle-1;
            }

            if(arr[start] > arr[middle]) {
                end = middle-1;
            }else{
                start = middle +1;
            }
        }
        return -1;
    }
}
