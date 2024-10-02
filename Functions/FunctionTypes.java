package basics.Functions;

import java.util.Scanner;

public class FunctionTypes {

    static int add( int num){
        return num*num;
    }

    static String name(String thisName){
        return thisName+"wtf";
    }

    static String[] arrayFunc(){
        String[] heroes = {"iron man" , "captain" , "blackWidow"};

        return heroes;
    }

    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);

        String thisName = sc.next();
        System.out.println(name(thisName));

        String[] heroesName = arrayFunc();

        for(String hero: heroesName){
            System.out.println(hero);
        }
    }
}
