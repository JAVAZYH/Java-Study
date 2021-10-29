package zyh.JAVAadvanced.Collection.Set.exar;

import java.util.HashSet;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/7/10
 * \* Time: 16:21
 * \
 */
public class PTest {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        Person p1 = new Person(1001,"AA");
        Person p2 = new Person(1002,"BB");

        set.add(p1);
        set.add(p2);

        p1.name = "CC";
        set.remove(p1);
        System.out.println(set);//1002,BB

        System.out.println("--------------");
        set.add(new Person(1001,"CC"));
        System.out.println(set);//1001 CC 1002 BB

        System.out.println("---------------");
        set.add(new Person(1001,"AA"));
        System.out.println(set);//1001 AA 1001 CC  1002 BB
    }
}