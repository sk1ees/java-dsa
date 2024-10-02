package basics.Strings;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//
//        String str = sc.next();
//
//        StringBuilder str1 = new StringBuilder(str);
//
//        str1.reverse();
//
//        String reverseStr = str1.toString();
//
//        if(str.equals(reverseStr)){
//            System.out.println("palindrome");
//        }else{
//            System.out.println("not");
//        }
//
//

        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        String reverseStr = "";

        for(int i=str.length()-1 ; i>=0 ; i--){

            reverseStr += str.charAt(i);
        }

        if(str.equals(reverseStr)){
            System.out.println("palindrome");
        }else{
            System.out.println("not palindrome");
        }




    }
}
