package basics.Algorithms.LinearSearch;

import java.util.Arrays;

public class Q2 {
    public static void main(String[] args) {

        String name = "electricity";
        char target = 'w';
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println( searchChar(name , target));
    }

    static boolean searchChar(String tempName , char tempTarget){

        char[] charArr = tempName.toCharArray();
        for(char str: charArr){
            if(str == tempTarget){
                return true;
            }
        }

      return false;
    };
}
