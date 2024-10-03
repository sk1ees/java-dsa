package basics.Algorithms.LinearSearch;

public class Q3 {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        int target = 13;
        System.out.println(linearSearch(arr , target , 1,4));
    }

    static int linearSearch(int[]arr ,int  target ,  int start , int end){

        for(int i = start ; i<= end ; i++){

            if(arr[i] == target){
                return i;
            }

        }

        return -1;
    }
}
