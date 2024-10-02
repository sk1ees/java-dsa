package basics.Array;

public class OnlyColumns {

    public static void main(String[] args){


        int[][] arr = {
                {1,2,3,4},{5,6,7,8}
        };
        int rows = arr.length;
        int cols = arr[0].length;

        System.out.println(rows);
        System.out.println(cols);


        for(int i = 0 ; i<cols ; i++){
            for(int j = 0 ; j<rows ; j++){
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }
    }


}
