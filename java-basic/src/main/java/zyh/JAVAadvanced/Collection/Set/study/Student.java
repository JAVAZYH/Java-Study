package zyh.JAVAadvanced.Collection.Set.study;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/7/10
 * \* Time: 15:28
 * \
 */
public class Student implements Comparable {
    String name;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    int age;
    @Override
    public int compareTo(Object o) {
        if (o instanceof Student){
            Student s=(Student)o;
//            return this.age-s.age;//从小到大
            int n=this.name.compareTo( s.name );
            if (n==0){
                return this.age-s.age;//从小到大
            }
            return  n;
        }
        return 0;
    }
}