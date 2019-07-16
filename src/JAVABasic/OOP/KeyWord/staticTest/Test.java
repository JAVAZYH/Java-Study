package JAVABasic.OOP.KeyWord.staticTest;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/7/4
 * \* Time: 14:07
 * \
 */
public class Test {
    Person person = new Person("Test");
    static{
        System.out.println("FileTest static");
    }

    public Test() {
        System.out.println("FileTest constructor");
    }

    public static void main(String[] args) {
        new MyClass();
    }
}

class Person{
    static{
        System.out.println("person static");
    }
    public Person(String str) {
        System.out.println("person "+str);
    }
}


class MyClass extends Test {
    Person person = new Person("MyClass");
    static{
        System.out.println("myclass static");
    }

    public MyClass() {
        System.out.println("myclass constructor");
    }
}