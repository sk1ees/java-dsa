package basics.homeworks;

public class ReverseArray {

    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        int arraySize = arr.length;

        int[] reverseArray = new int[arr.length];
        int k = 0;
        for(int i = arraySize-1 ; i>=0;i--){
            reverseArray[k] = arr[i];
                k++;
        }
        for(int num: reverseArray){
            System.out.print(num+ " ");
        }
    }
}
