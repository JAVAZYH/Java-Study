package Collection.Set;

import Collection.Entity.Student;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/5/3
 * \* Time: 23:24
 * \
 */
public class HashSetTest {
   public static void main(String[] args){
//test01();
       test02();
   }
   public static void test01(){
       //无序，相同的元素无法放入
       HashSet<String> set=new HashSet<>(  );
       set.add( "aaa" );
       set.add( "bbb" );
       set.add( "ccc" );
       set.add( "ddd" );
       set.add( "aaa" );
       System.out.println( set );
       /**
        * 常用方法
        * size,isempty,clear,remove,cotains,iterator,toarray
        */
       List<String> list= Arrays.asList( "aa","bb","cc","cc" );
       //addAll可以添加实现collections接口的集合,可以把list转换为set，可以去重
      set.addAll( list );
      System.out.println( set );
   }

    /**
     * 判断元素是否重复
     */
   public static void test02(){
       Set<Student> set=new HashSet<Student>(  );
       Student student=new Student(1001,"tom");
       Student student2=new Student(1001,"tom");
//       Student student3=new Student(1003,"zyh");
       set.add( student );
       set.add( student2 );
//       System.out.println( student.hashCode() );
       System.out.println( set );
   }
}
