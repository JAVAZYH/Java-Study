package zyh.JAVAadvanced.Collection.Set.exar;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/7/10
 * \* Time: 15:48
 * \
 */
public class Student implements Comparable{
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    String name;
    int age;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof Student){
            Student s=(Student)o;
//            int n=this.name.compareTo(  s.name);
////            if (n==0){
////                return  this.age-s.age;
////            }
////            return n;
            return  this.age-s.age;
        }
        return 0;
    }
}