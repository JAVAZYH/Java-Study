package Basic.OOP;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/6/24
 * \* Time: 15:47
 * \
 */
public class Test {
    public static void main(String[] args) {
        Student stu=new Student();
        stu.age=10;
        stu.name="张三";
        stu.info();
        Student stu2=new Student("李四",20);
        stu2.info();
    }


}