package basics.Strings;

import java.util.Scanner;

public class ReverseString {
//    public static void main(String[] args){
//        String name = "deep";
//        String reverseName = "";
//        for(int i = name.length()-1 ; i>=0 ; i--){
//                reverseName += name.charAt(i);
//        }
//        System.out.println(reverseName);
//    }

public static void main(String[] args){

    StringBuilder str = new StringBuilder("deep");

    for(int i = 0 ; i<str.length()-1 ; i++){
        int front = i;
        int back = str.length()-1-i;

        char frontChar = str.charAt(front);
        char backChar = str.charAt(back);

        str.setCharAt(front , backChar);
        str.setCharAt(back , frontChar);
    }
    System.out.println(str);

}










}
