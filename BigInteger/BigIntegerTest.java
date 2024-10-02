package basics.BigInteger;

import java.math.BigInteger;
public class BigIntegerTest {
    public static void main(String[] args){

        BigInteger x = new BigInteger("4534534534534534");
        BigInteger y = new BigInteger("3764287374862734");

       //int to bigInt


        int a = 9343;
        BigInteger b = new BigInteger(a + "");
        System.out.println(b);

       //BigInt to Int

       BigInteger f = new BigInteger("465");
       int p = f.intValue();

        System.out.println(p);
    }
}
