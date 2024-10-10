package basics.Algorithms.BinarySearch.Questions;

public class DuplicatePivotElem {
    public static void main(String[] args) {
        int[] arr = {2,2,2,2,2,5,6,9,6,2,2,2};
        int target = 9;
        System.out.println(search(arr, target));
    }

    static int search(int[] arr, int target) {


        int pivot = searchPivot(arr);


        if (pivot == -1) {
            return binarySearch(arr, target, 0, arr.length - 1);
        }
        if (target == arr[pivot]) {
            return pivot;
        }

        if (target >= arr[0]) {
            return binarySearch(arr, target, 0, pivot - 1);
        } else {
            return binarySearch(arr, target, pivot + 1, arr.length - 1);
        }


    }

    static int binarySearch(int[] arr, int target, int start, int end) {

        while (start <= end) {
            int middle = start + (end - start) / 2;

            if (target > arr[middle]) {
                start = middle + 1;
            } else if (target < arr[middle]) {
                end = middle - 1;
            } else {
                return middle;
            }
        }
        return -1;
    }


    static int searchPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;


        while (start <= end) {
            int middle = start + (end - start) / 2;


//            cases
            if (middle < end && arr[middle] > arr[middle + 1]) {
                return middle;
            }

            if (middle > start && arr[middle] < arr[middle - 1]) {
                return middle - 1;
            }

        //for duplicate elements

            if(arr[middle] == arr[start] || arr[middle] == arr[end]){

                if(arr[start] > arr[start+1]){
                    return start;
                }else if(arr[end] < arr[end-1]){
                    return end-1;

                    //left side is sorted hence find in the right hand side
                }

                start++;
                end--;
            }else if (arr[start] < arr[middle] || arr[start] == arr[middle]) {
                start = middle+1;
            }


        }
        return -1;
    }
}