package JAVAadvanced.Thread.itguigu.synchronizedTest;

import com.atguigu.day17.java.Person;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/7/16
 * \* Time: 9:51
 * \
 */
public class RuntimeClass {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();

        System.out.println(p1==p2);

        Class  clazz=Person.class;
        Class clazz2=p1.getClass();
        Class clazz3=p2.getClass();
        System.out.println(clazz==clazz2);
        System.out.println(clazz2==clazz3);
    }
}