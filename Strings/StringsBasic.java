package basics.Strings;

import java.util.Scanner;

public class StringsBasic {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String name = new String("deep");



        if(name.equals("deep") ){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
