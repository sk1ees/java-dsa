package basics.Patterns;

public class Pattern8 {


    public static void main(String[] args) {



        //pyramid


        for (int i = 0; i < 5; i++) {


            for (int j = 0; j <= 5-i-1; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < (2*i)+1; j++) {
                System.out.print("* ");
            }
            for (int j = 0; j <= 5-i-1; j++) {
                System.out.print("  ");
            }
            System.out.println();
        }


//        upside-down


        for (int i = 5; i >= 0; i--) {


            for (int j = 5; j > i; j--) {
                System.out.print("  ");
            }
            for (int j = 0; j < (2*i)+1; j++) {
                System.out.print("* ");
            }

            for (int j = 5; j > i; j--) {
                System.out.print("  ");
            }
            System.out.println();
        }
    }
}
