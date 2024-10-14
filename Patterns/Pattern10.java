package basics.Patterns;

public class Pattern10 {
    public static void main(String[] args) {
//        1         1
//        1 2     2 1
//        1 2 3 3 2 1
int space = 2*(3-1);
        for (int i = 1; i <= 3; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            for (int j = 1; j <=  space; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print("*");
            }

            System.out.println();
            space -=2;
        }



    }
}
