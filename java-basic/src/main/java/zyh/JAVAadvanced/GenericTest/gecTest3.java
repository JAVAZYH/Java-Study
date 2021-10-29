package zyh.JAVAadvanced.GenericTest;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/7/12
 * \* Time: 17:13
 * \
 */
//通配符的限制条件
public class gecTest3 {
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


//        info( integers );
    }
//    public void info(List<? extends Integer> list){
//
//    }

    public void info(List<? super Object> list){

    }
}