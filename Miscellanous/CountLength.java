package basics.Miscellanous;

import java.util.Scanner;

public class CountLength {
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int number = sc.nextInt();
//int count = 0;
//    while (number>0){
//        number = number/10;
//        count++;
//    }
//        System.out.println(count);
//
//
//    }

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);


        String s1 = scn.next();

        String s2 = scn.next();


        if(s1 == s2){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }

}
