package Reflection.Entity;

import java.util.Objects;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/5/3
 * \* Time: 23:40
 * \
 */
public class Student extends Base{

    public Integer getNo() {
        return no;
    }

    public void setNo(Integer no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Student(Integer no, String name) {
        this.no = no;
        this.name = name;
    }

    public Student() {
    }
    private Integer no;
    private String name;

//    public void baseMethod(){
//        System.out.println("i am Student.Class.baseMethod");
//    }
    private void privateMethod(){
        System.out.println("i am privateMethod");
    }
    protected void protectedMethod(){
        System.out.println("i am protectedMethod");
    }
    public void publicMethod(){
        System.out.println("i am public method");
    }
}