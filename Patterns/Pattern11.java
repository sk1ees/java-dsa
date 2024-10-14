package basics.Patterns;

public class Pattern11 {
    public static void main(String[] args) {


        for (int index = 0; index < 5; index++) {
            for (char i = 'A'; i <= 'A'+index; i++) {
                System.out.print(i);

            }
            System.out.println();
        }
    }
}
