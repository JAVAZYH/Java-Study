package JAVABasic.Type.BigValue;

import java.math.BigInteger;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/6/25
 * \* Time: 16:52
 * \
 */
public class BigValueTest {
    public static void main(String[] args) {
        int k=10;
        int n=10;
        Long aLong=12L;
        BigInteger bigInteger=BigInteger.valueOf( 10000 );
        for(int i=1;i<k;i++){
            bigInteger=bigInteger.multiply( bigInteger );
        }
        System.out.println(bigInteger);

    }
}