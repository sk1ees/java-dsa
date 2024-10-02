package basics.Functions;

import java.util.Scanner;

public class MethodOverloading {

    static int add(int a , int b){
        System.out.println("from integer function: ");

        return a+b;
    }

    static String add(String a , String b){
        System.out.println("from string function: ");

        return a+b;
    }

    static String add(String a , int b){
        System.out.println("from hybridString function: ");

            return a+b;
    }

    public static void main(String[] args){
        System.out.println(add(12,10));
        System.out.println(add("deep","waterfall"));
        System.out.println(add("level: ",10));


    }
}
