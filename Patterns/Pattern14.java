package basics.Patterns;

public class Pattern14 {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            char count = 'A';

            for (int j = 0; j < 5-i-1; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < (2*i)+1; j++) {

                int half = ((2*i)+1)/2;
                if(j < half){
                    System.out.print(count+" ");
                    ++count;
                }else{

                    System.out.print( count-- + " ");
                }




            }
            for (int j = 0; j < 5-i-1; j++) {
                System.out.print("  ");
            }

            System.out.println();
        }
    }
}
