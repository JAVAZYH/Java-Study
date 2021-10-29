package zyh.JAVABasic.OOP.Encapsulation;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/6/26
 * \* Time: 11:32
 * \
 */
public class Person {
   private int age;
   public void  setAge(int age){
       if (age>=0&&age<=130){
       this.age=age;
       }
       else {
           System.out.println("age is error");
       }
   }
   public int getAge(){
       return this.age;
   }
}