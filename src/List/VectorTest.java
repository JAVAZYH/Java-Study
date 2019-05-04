package List;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/5/3
 * \* Time: 15:35
 * \
 */
public class VectorTest {
    public static void  main(String args[]){
        Vector<Integer> nums=new Vector<>(  );
        nums.add( 1 );
        nums.add( 102);
        nums.add( 13);
        nums.add( 14);
        //迭代器,为了替代Enumeration
//        Iterator<Integer> iterator=nums.iterator();
//        while (iterator.hasNext()){
//            System.out.println( iterator.next() );
//        }
        //enumeration枚举,适用于Vector、HashTable,Properties等集合，已过时
        Enumeration<Integer> enumeration=nums.elements();
        while (enumeration.hasMoreElements()){
            System.out.println( enumeration.nextElement() );
        }
        //vector已过时，应该使用Collections.synchronizedList

    }


}