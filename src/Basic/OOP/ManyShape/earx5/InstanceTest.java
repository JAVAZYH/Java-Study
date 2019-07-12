package Basic.OOP.ManyShape.earx5;


/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/7/1
 * \* Time: 14:55
 * \
 */

/**
 * 建立InstanceTest 类，在类中定义方法method(Person e);
 * 在method中:
 * (1)根据e的类型调用相应类的getInfo()方法。
 * (2)根据e的类型执行：
 * 如果e为Person类的对象，输出：
 * “a person”;
 * 如果e为Student类的对象，输出：
 * “a student”
 * “a person ”
 * 如果e为Graduate类的对象，输出：
 * “a graduated student”
 * “a student”
 * “a person”
 */
public class InstanceTest {
public  void method(Person e){
    //多个else if 子类写上面
//    if (e instanceof Graduate){
//        System.out.println("a graduate student");
//        System.out.println("a student");
//        System.out.println("a person");
//    }else if (e instanceof Student){
//        System.out.println("a student");
//        System.out.println("a person");
//    }else if (e instanceof Person){
//        System.out.println("a person");
//    }

    if (e instanceof  Graduate){
        System.out.println(" a graduated student");
    }
    if (e instanceof  Student){
        System.out.println("a  student");
    }
    if (e instanceof Person){
        System.out.println("a person");
    }
}

    public static void main(String[] args) {
        InstanceTest ins=new InstanceTest();
        ins.method( new Person() );
        System.out.println("--------");
        ins.method( new Student() );
        System.out.println("--------");
        ins.method( new Graduate() );
    }
}
class Person{
    protected String name="person";
    protected int age=50;
    public String getInfo(){
        return "name:"+name+"age:"+age;
    }
}
class Student extends Person{
    protected String school="pku";
    public String getInfo(){
        return "name:"+name+"age:"+age+"school"+school;
    }
}
  class Graduate extends Student{
    public String major="IT";
    public String getInfo(){
        return "name:"+name+"age:"+age+"school"+school+"major"+major;
    }
  }