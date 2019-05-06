package Collection.List;

import java.util.LinkedList;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/5/3
 * \* Time: 16:18
 * \
 */
public class LinkedListTest {
    public static void main(String args[]){
        LinkedList<String> list=new LinkedList<>(  );
        list.add( "aaa" );
        list.addFirst( "bbb" );
        list.addLast( "ccc" );
        System.out.println( list.getFirst() );
        System.out.println( list.getLast() );
    }
}