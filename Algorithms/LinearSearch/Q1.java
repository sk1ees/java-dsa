package basics.Algorithms.LinearSearch;

public class Q1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int target = 8;
        System.out.println(search(arr , target));
    }
    static boolean search(int[] arr1 , int value){

        if(arr1.length == 0 ){
            return false;
        }
        for(int num : arr1){
            if(num == value){
                return true;
            }
        };

        return false;
    }
}
