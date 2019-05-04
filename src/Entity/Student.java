package Entity;

import java.util.Objects;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/5/3
 * \* Time: 23:40
 * \
 */
public class Student {

    public Integer getNo() {
        return no;
    }

    public void setNo(Integer no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "no=" + no +
                ", name='" + name + '\'' +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(Integer no, String name) {
        this.no = no;
        this.name = name;
    }

//    @Override
//    public int hashCode() {
//        System.out.println( "student.hashCode()" );
////        return super.hashCode();
//        return 111;
//    }
//
//    @Override
//    public boolean equals(Object obj) {
////        return super.equals( obj );
//        System.out.println( "student.equals" );
//        return false;
//    }

    @Override
    public boolean equals(Object o) {
        System.out.println( "student.equals" );
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Student student = (Student) o;
//        return no.equals( student.no ) &&
//                name.equals( student.name );
return true;
    }
    @Override
    public int hashCode() {
        System.out.println( "student.hashcode" );
        return Objects.hash( no, name );
    }

    public Student() {
    }

    private Integer no;
    private String name;
}