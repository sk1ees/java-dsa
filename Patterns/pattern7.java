package basics.Patterns;

public class pattern7 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j =5;j>5-i; j--) {
                System.out.print(" ");
            }
            for (int j = 5; j>=(2*i)-1; j--) {
                System.out.print('+');
            }
            for (int j =5;j>5-i; j--) {
                System.out.print(" ");
            }
            System.out.println();
        }

    }
}
