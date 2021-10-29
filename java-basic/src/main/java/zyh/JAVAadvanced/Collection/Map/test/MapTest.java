package zyh.JAVAadvanced.Collection.Map.test;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/7/12
 * \* Time: 10:52
 * \
 */
public class MapTest {
    @Test
    public  void test(){
//        HashMap<Object, Object> hashMap = new HashMap<>();
//        hashMap.put( "111",111 );
//        hashMap.put( "111",111 );
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put( 1,1 );
        map.put( 2,2 );
        map.put( 3,3 );
        map.put( 4,4 );
        Set<Map.Entry<Integer, Integer>> entrySet = map.entrySet();
        Iterator<Map.Entry<Integer, Integer>> iterator = entrySet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }
}