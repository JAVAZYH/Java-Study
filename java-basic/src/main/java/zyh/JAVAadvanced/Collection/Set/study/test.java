package zyh.JAVAadvanced.Collection.Set.study;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.TreeSet;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/7/10
 * \* Time: 14:18
 * \
 */
public class test {

    public static void main(String[] args) {
//        HashSet<Object> set = new HashSet<>();
//       Person p1 = new Person( "aa", "18" );
//        Person p2 = new Person( "aa", "18" );
//       set.add( p1 );
//       set.add( p2 );
//       set.add( p1 );
//        System.out.println(p1.hashCode()+"  p2  "+p2.hashCode());
//        System.out.println(set);
//        set.add(  )

        TreeSet<Object> set = new TreeSet<>();
        Student s1 = new Student( "aa", 18 );
        Student s2 = new Student( "aa", 18);
        set.add( s1 );
        set.add( s2 );
    }
    @Test
    public  void test(){
        HashSet<Object> set = new HashSet<>();
        set.add( new Student( "aa", 18) );
        set.add( new Student( "aa", 21));
        set.add( new Student( "aa", 22) );
        set.add(  new Student( "bb", 24) );
        set.add(  new Student( "cc", 25) );
        set.add(  new Student( "dd", 26) );
        System.out.println(set);


    }



}
