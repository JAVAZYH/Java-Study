package Basic.OOP.exar;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/6/24
 * \* Time: 18:41
 * \
 */
public class Person {
    String name;
    int age;
    int sex;
    public void  study(){
        System.out.println("studying");
    }
    public void showAge(){
        System.out.println(age);
    }
    public void addAge(int i){
        age+=i;
    }
}