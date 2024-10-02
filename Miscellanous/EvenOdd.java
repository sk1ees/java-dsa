package basics.Miscellanous;

import java.util.Scanner;

public class EvenOdd {

public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    char num1 = sc.next().charAt(0);

    switch (num1) {
        case 'a', 'e' , 'i' , 'o' ,'u'-> System.out.println("vowel");

        default -> System.out.println("consonant");
    }
}


}
