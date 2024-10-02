package basics.Miscellanous;
import java.util.*;
public class Ternary {


    public static void main(String[] args){
      Scanner sc  = new Scanner(System.in);

      int age = sc.nextInt();
      String gender = "male";

//        System.out.println(age);
//        System.out.println(gender);

        if(age < 18 && gender == "male"){
            System.out.println("underage");
        }else{
            System.out.println("adult");
        }
    }
}
