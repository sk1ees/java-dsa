package basics.ArrayList.ArrayQues;

public class LargestNumArray {
    public static void main(String[] args) {

        int[] arr = {1,22,3,4,5};

        System.out.println(largestNum(arr , 2 , arr.length));
    }
    static int largestNum(int[] arr1 ,int start , int end){

        int highest = arr1[start];
        for (int i = start; i < end; i++) {

            if(arr1[i] > highest){
                highest = arr1[i];
            }
        }
        return highest;
    }
}
