package basics.Patterns;

public class Pattern16 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (char j = (char) ('E' - i); j<='E'; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
