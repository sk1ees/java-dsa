package basics.Miscellanous;

public class RandomNumber {

public static void main(String[] args){

    while(true){
        int randomNumber = (int) (Math.random()*10) +1;

        if(randomNumber == 5 ){
            break;
        }
        System.out.print(randomNumber);
    }

}


}
