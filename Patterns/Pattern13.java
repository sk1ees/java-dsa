package basics.Patterns;

public class Pattern13 {
    public static void main(String[] args) {
        char count = 'A';
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i ; j++) {
                System.out.print(count);

            }
            System.out.println();
            count++;
        }
    }
}
