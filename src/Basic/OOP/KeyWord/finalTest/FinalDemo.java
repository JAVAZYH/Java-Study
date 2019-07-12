package Basic.OOP.KeyWord.finalTest;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/7/4
 * \* Time: 11:27
 * \
 */
class Person2 {
    String name = "张三";
}

public class FinalDemo {

    public static void main(String[] args) {
        final Person2 p = new Person2();
        p.name = "李四";
        changeName(p);
        System.out.println(p.name);
    }

    static void changeName(Person2 p) {
        p = new Person2();
    }
}