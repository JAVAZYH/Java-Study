package zyh.JAVABasic.OOP.Encapsulation;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/6/26
 * \* Time: 11:32
 * \
 */
public class PersonTest {
    public static void main(String[] args) {
        Person p=new Person();
        p.setAge( 100 );
        System.out.println(p.getAge());
    }
}