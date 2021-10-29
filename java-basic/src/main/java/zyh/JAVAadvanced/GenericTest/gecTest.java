package zyh.JAVAadvanced.GenericTest;

import org.junit.jupiter.api.Test;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/7/12
 * \* Time: 16:20
 * \
 */
public class gecTest {
    @Test
    public  void test(){
//        SubClass subClass = new SubClass();
//        subClass.setT( "aaa" );
//        System.out.println(subClass.getT());
        SubClass<Integer> subClass = new SubClass<Integer>();
        subClass.setT( 222 );
        System.out.println(subClass.getT());
    }
    @Test
    public  void test2(){
        Integer e = getE( 11 );
        String aa = getE( "aa" );
    }
    //测试自定义方法
    public static  <E> E getE(E e){
        return e;
    }
}