package basics.ArrayList.ArrayQues;

import java.util.ArrayList;
import java.util.Scanner;

public class DynaQ1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(3);

//        list.add(32);
//        list.add(62);
//        list.add(52);
//        list.remove(2);
//        System.out.println(list);

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            list.add(sc.nextInt());
        }

        System.out.println(list);
    }
}
