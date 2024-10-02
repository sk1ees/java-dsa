package basics.homeworks;

import java.util.Scanner;

public class StringChange {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();

        while(testCase>0){
            String str = sc.next();
            int firstIndex = str.charAt(0);
            StringBuilder str1 = new StringBuilder(str);

            for(int i = 1 ; i<=str.length()-1 ; i++){
                int strIndex = str.charAt(i);
                if(strIndex ==firstIndex){
                    str1.setCharAt(i , '$');

                }
            }

            str = str1.toString();
            System.out.println(str);
            testCase = testCase-1;
        }
    }

    }

