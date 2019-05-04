package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/5/3
 * \* Time: 16:38
 * \
 */
public class ArrayListVSLinkedList {
public static void main(String args[]){
    ArrayList<Integer> list1=new ArrayList<>(  );
    LinkedList<Integer> list2=new LinkedList<>(  );
    long start=System.currentTimeMillis();
    for (int i=0;i<100000;i++){
        list1.add( 0,i );
    }
    long end=System.currentTimeMillis();
    System.out.println( end-start +"ms");
}
}