package zyh.JAVAadvanced.Collection.List.exar;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/7/9
 * \* Time: 16:32
 * \
 */
public class test {
      @Test
      public  void test(){
          Collection c=new ArrayList(  );
          c.add( "aaa" );
          c.add( "bbb" );
          c.add( "ccc" );
          c.add( "ddd" );
//          Iterator iterator = c.iterator();
//          while (iterator.hasNext()){
//              System.out.println(iterator.next());//每next一次指针就会下移一次
//          }
          Collection c2=new ArrayList(  );
          c2.add( "aaa" );
          c2.add( "bbb" );
          c2.add( "ccc" );
          c2.add( "ddd" );
//          System.out.println(c2.containsAll( c ));
//          System.out.println(c2.contains( "ccc" ));
//          for (Object object:c2){
//              System.out.println(object);
//          }
            int[] arr={12,23,34,4,5,6,6};
//            for (int i:arr){
//                for (int j:arr){
//                    System.out.println(i+j);
//                }
////                System.out.println(i);
//            }
          //从arr中取出i,int i=arr[i];
          for(int i:arr){
              i=100;
          }
          System.out.println( Arrays.toString( arr ) );//此方法无法修改数组中的值
      }

      @Test
      public  void test2(){
          ArrayList<Object> list = new ArrayList<>();
          list.add( "aaaa" );
          list.add( "bbb" );
          list.add( 1 );
//          list.remove( new Integer( 1 ) );
//          System.out.println(list);
          System.out.println(list.get( 2 ).getClass());

      }

}