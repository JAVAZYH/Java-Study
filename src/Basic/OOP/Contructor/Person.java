package Basic.OOP.Contructor;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/6/26
 * \* Time: 14:00
 * \
 */
public class Person {
    private int age;
    private  String name;
    Person(){
        this.age=18;
        this.name="111";
    }
    public void  setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
}