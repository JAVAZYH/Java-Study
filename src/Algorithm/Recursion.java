package Algorithm;

import com.sun.media.sound.SoftTuning;
import com.sun.org.apache.bcel.internal.generic.RETURN;
import org.junit.jupiter.api.Test;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: javazyh
 * \* Date: 2019/5/7
 * \* Time: 11:18
 * \
 */
public class Recursion {

    public static void main(String[] args) {
        System.out.println(test01( 5 ));
//        System.out.println(test02( 40 ));
    }
    /**
     * 计算5的阶乘(result = 5*4*3*2*1)
     */
    public static int test01(int i){
          return  i==1?1:i*test01( i-1 );
//           if (i==1){
//               return 1;
//           }else{
//               return i*test01( i-1 );
//           }

    }
    /**
     * 求数列：1，1，2，3，5，8......第40位的数
     */
    public static int  test02(int i){
        return i==1||i==2?1:test02( i-1 )+test02( i-2 );
//        if (i==1||i==2){
//            return 1;
//        }else {
//            return test02( i-1 )+test02( i-2 );
//        }
    }

}