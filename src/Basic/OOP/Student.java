package Basic.OOP;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/6/24
 * \* Time: 15:45
 * \
 */
public class Student {
    String name;
    int age;

    public Student(String name, int age) {
     this.name=name;
     this.age=age;
    }

    public Student() {

    }

    void info(){
        System.out.println(name+"-"+age);
    }
}