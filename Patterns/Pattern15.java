package basics.Patterns;

public class Pattern15 {
//    C
//    C B
//    C B A
    public static void main(String[] args) {



        for (int i = 0; i < 3; i++) {
            char alpha = 'A'+ (3-1);
            for (int j = 0; j <= i; j++) {
                System.out.print(alpha-- + " ");
            }

            System.out.println();
        }
    }
}
