package Basic.OOP.override;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/6/29
 * \* Time: 15:50
 * \
 */
public class Person {
    private   void test(){
        System.out.println("person");
    }

    public static void main(String[] args) {
        student s=new student();
        s.test();
    }
}
class student extends Person{
      void test(){
//          System.out.println("student");
    }

}