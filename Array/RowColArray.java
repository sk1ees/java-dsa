package basics.Array;

public class RowColArray {

    public static void main(String[] args){

        int[][] arr = {
                {1, 2},
                {4, 5},
                {8, 9},

    };


    int rows = arr.length;
    int cols = arr[0].length;

        int[] arrayConfined = new int[rows];
        int[] arr2 =new int[cols];
        int[] tempArr = new int[arrayConfined.length + arr2.length];

        for(int i = 0 ; i < rows ; i++){
        for(int j = 0 ; j<cols ; j++){
           arrayConfined[i] += arr[i][j];

        }
        }

        for(int i = 0 ; i < cols ; i++){
            for(int j = 0 ; j<rows ; j++){
                arr2[i] += arr[j][i];

            }
        }

//        for(int i = rows ; i<arrayConfined.length ; i++){
//            arrayConfined[i] += arr[][]
//        }



//        for(int item: arrayConfined){
//            System.out.print(item + " ");
//        }


        //array merge

        int pos = 0;


        for(int elem: arrayConfined){
            tempArr[pos] = elem;
            pos++;
        }

        for(int elem: arr2){
            tempArr[pos] = elem;
            pos++;
        }

        for(int item: tempArr){
            System.out.print(item + " ");
        }


    }


}
