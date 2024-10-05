package basics.Algorithms.BinarySearch.Questions;

public class checkCharFloor {
    public static void main(String[] args) {
        char[] arr = {'a','b','d','e','g'};
        char target = 'a';
        System.out.println(searchChar(arr,target));
    }
    static char searchChar(char[] arr , char target){
        int start = 0 ;
         int end = arr.length-1;

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
