package zyh.JAVAadvanced.GenericTest;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/7/12
 * \* Time: 17:05
 * \
 */
public class gecTest2 {
    @Test
    public  void test(){
//        ArrayList<String> list = new ArrayList<>();
//        info( list );
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add( 111 );
        integers.add( 222 );
        ArrayList<?>  list2=integers;
        //通过list2遍历集合中的内容
        for (Object obj:list2){
            System.out.println(obj);
        }


         info( integers );
    }
    public void info(List<?> list){

    }

    /**
     * 通配符使用注意的问题
     */
    @Test
    public  void test2(){

    }
}