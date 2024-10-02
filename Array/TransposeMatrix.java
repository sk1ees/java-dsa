package basics.Array;

public class TransposeMatrix {
    public static void main(String[] args){


        int[][]  A = {

                {52, 4, 60, 79, 13, 45, 100, 72},

                {54, 57, 96, 89, 2, 93, 19, 66},

                {29, 33, 4, 88, 69, 93, 19, 7},
                {82, 14, 16, 62, 29, 26, 60, 32},

                {81, 71, 63, 93, 15, 62, 17, 68},

                {70, 12, 57, 72, 56, 27, 89, 84},
                {11, 92, 24, 32, 36, 42, 90, 69},
                {7, 57, 31, 36, 82, 42, 19, 15},
                {12, 81, 7, 27, 94, 23, 94, 64},

        };


        int rows = A.length;
        int cols = A[0].length;

        System.out.println(rows + " " + cols);


        int[][]B = new int[cols][rows];
        for(int i = 0 ; i<cols ; i++){
            for(int j = 0 ; j<rows;j++){
                B[i][j] = A[j][i];
            }
        }

        for(int i = 0 ; i<rows ; i++){
            for(int j = 0 ; j<cols;j++){
                System.out.print(B[j][i] + " ");
            }
            System.out.println();
        }


    }
}
