package Basic.OOP.KeyWord.staticTest;

import javax.naming.Name;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/7/2
 * \* Time: 15:44
 * \
 */
public class StaticTest {


    public static void main(String[] args) {
        Dog d1=new Dog( "11" );
        Dog d2=new Dog( "22" );
        Dog d3=new Dog( "33" );
        d1.info();
        d2.info();
        d3.info();
    }
}
class Dog{
    int ID;
    String name;
    static int count;
    Dog(String name){
        this.name=name;
        this.ID=++count;
    }
    public void info(){
        System.out.println("id"+ID+"name"+name);
    }
}