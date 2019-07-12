package Basic.OOP.innerClassTest;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/7/3
 * \* Time: 16:38
 * \
 */
class Person{
    String name="person";
    static  int age=10;
    public  void personShow(){
        System.out.println("personShow");
    }
    class Women{
        String name="women";
        public  void info(){
            //调用外部类的属性
            System.out.println(Person.this.name);
        //调用外部类的方法
            Person.this.personShow();
        }

    }
    static class  Man{
        //静态内部类不能调用外部类的实例变量和非静态方法
        public  void info(){
            //调用外部类的类变量
            System.out.println("man"+Person.age);
       //调用外部类的静态方法
        }
    }
}
public class Test2 {
    public static void main(String[] args) {
//        new Person().new Women();
        //全类名
//        Person person=new Person();
//        Person.Women women=person.new Women();
//        women.info();
        //创建静态内部类的对象
        new Person.Man();//new 的是person类中的man对象
        Person.Man man=new Person.Man();
        man.info();

    }
}