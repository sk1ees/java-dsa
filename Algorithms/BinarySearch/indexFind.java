package basics.Algorithms.BinarySearch;
//find the index of the target number in the array
public class indexFind {
    public static void main(String[] args) {


        int[] arr = {1,2,3,4,5,6,7,8,9};
        int target = 8;

        System.out.println(searchIndex(arr , target));
}

static int searchIndex(int[] arr , int target){

        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int middle = start+(end-start)/2;

            if(target > arr[middle]){
                start = middle+1;
            }else if(target < arr[middle]){
                end = middle -1;
            }else{
                return middle;
            }
        }


    return -1;
    }
}
