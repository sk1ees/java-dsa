package basics.Algorithms.BinarySearch.Questions;

public class PeakIndex {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,4,3,2};
int target = 5;
        System.out.println(searchPeak(arr));

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
        return arr[start];
    }
    }

