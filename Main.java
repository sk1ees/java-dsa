package basics;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        System.out.print("Enter your name: ");

        Scanner sc = new Scanner(System.in);

        String name = sc.next(); // Entered the value - "Deep Sarkar"

        if(name == "Deep"){

            System.out.println( "matched");

        }else if(name == "Deep Sarkar"){

            System.out.println("not matched!");

        }else{

            System.out.println("locked!");
        }

    }
}