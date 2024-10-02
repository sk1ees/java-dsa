package basics.BigInteger;

import java.math.BigInteger;

public class FactorialBigInt {

    public static void main(String[] args){

        int number = 500;

        BigInteger fact = new BigInteger("1");

        for(int i = 1 ; i<=number ; i++){
            BigInteger tempVal = new BigInteger(i + "");
            fact = fact.multiply(tempVal);
        }
        System.out.println(fact);
    }
}
