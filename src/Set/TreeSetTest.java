package Set;

import Entity.User;

import java.util.TreeSet;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/5/4
 * \* Time: 13:56
 * \
 */
public class TreeSetTest {
    public static void main(String args[]){
      test01();
    }

    public static void test01(){
//        TreeSet<Integer> set=new TreeSet<>(  );
////        set.add( 1 );
////        set.add( 1 );
////         set.add( 32 );
////        set.add( 342 );
////        set.add( 55 );
////        set.add( 897 );
        TreeSet<User> set=new TreeSet<>(new UserComparator());
        set.add( new User( "111",10,20 ) );
        set.add( new User( "222",11,20 ) );
        set.add( new User( "333b",12,20 ) );
        set.add( new User( "333a",12,20 ));
        set.add( new User( "333",12,44 ) );
        System.out.println( set );
    }
}