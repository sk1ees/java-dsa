package basics.Patterns;

public class Pattern12 {
    public static void main(String[] args) {
//        for (int index = 5; index >=0; index--) {
//            for (char i = 'A'; i <= 'A'+index; i++) {
//                System.out.print(i);
//
//            }
//            System.out.println();
//        }


//        better optimized
        for (int index = 0; index <=5; index++) {
            for (char i = 'A'; i <= 'A'+(5-index-1); i++) {
                System.out.print(i);

            }
            System.out.println();
        }

    }
}
