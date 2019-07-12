package Algorithm.recursion;

import com.sun.media.sound.SoftTuning;
import com.sun.org.apache.bcel.internal.generic.RETURN;
import org.junit.jupiter.api.Test;

import java.security.interfaces.ECKey;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: javazyh
 * \* Date: 2019/5/7
 * \* Time: 11:18
 * \
 */
public class Recursion {


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

    /**
     * 递归计算数组中元素的和
     * arr[]={1,2,3,4,5,6,7}
     */
    public static int test(int arr[],int begin){
        if (begin== arr.length){
            return 0;
        }
//        int x=test(arr,begin+1 );
        return arr[begin]+test( arr,begin+1 );
    }

    /**
     * 递归计算数组中元素的个数
     * @param
     */
    public static int numbers(int arr[],int begin){
        if (begin==arr.length){
            return 0;
        }
        return 1+numbers( arr,begin+1 );
    }
    public static void main(String[] args) {
//        System.out.println(test01( 5 ));
//        System.out.println(test02( 40 ));
        int arr[]={1,2,3,4,5,6,7};
        System.out.println(test( arr,0 ));
        System.out.println(numbers( arr,0 ));
    }


}