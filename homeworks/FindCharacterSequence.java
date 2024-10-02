package basics.homeworks;

public class FindCharacterSequence {
    public static void main(String[] args){
    String str = "mpampamm";

    while(str.length()>0){
        if(str.contains("m") && str.contains("a")){
            int strIndex =  str.indexOf("m");
            int strIndex2 = str.indexOf("a");
            StringBuilder tempStr = new StringBuilder(str);
            tempStr.deleteCharAt(strIndex);

            if (strIndex2 > strIndex) {
                strIndex2--;
            }

            tempStr.deleteCharAt(strIndex2);
            str = tempStr.toString();
//            System.out.println(str);
        }else if(str.contains("p") && str.contains("m")){
            int strIndex =  str.indexOf("p");
            int strIndex2 = str.indexOf("m");
            StringBuilder tempStr = new StringBuilder(str);
            tempStr.deleteCharAt(strIndex);
            if (strIndex2 > strIndex) {
                strIndex2--;
            }

            tempStr.deleteCharAt(strIndex2);
            str = tempStr.toString();
//            System.out.println(str);
        }

        else{
            System.out.println("not empty");
            break;
        }

        if(str.length()  == 0){
            System.out.println("empty");
        }
//        System.out.println(str);
    }

     }
    }

