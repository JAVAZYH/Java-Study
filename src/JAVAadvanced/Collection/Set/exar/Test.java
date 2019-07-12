package JAVAadvanced.Collection.Set.exar;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/7/10
 * \* Time: 15:50
 * \
 */
public class Test {
    public static void main(String[] args) {
        Comparator comparator = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof  Student && o2 instanceof Student){
                    Student student = (Student) o1;
                    Student student1 = (Student) o2;
                    return  student.name.compareTo( student1.name );
                }
              return 0;
            }
        };
        TreeSet<Object> set = new TreeSet<>(comparator);
        set.add( new Student( "aa",10 ) );
        set.add( new Student( "aa",11 ) );
        set.add( new Student( "aa",12 ) );
        set.add( new Student( "bb",13 ) );
        set.add( new Student( "cc",9 ) );
        System.out.println(set);

    }


}