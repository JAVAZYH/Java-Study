package zyh.JAVAadvanced.IO.objectStream;

import java.io.Serializable;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/7/15
 * \* Time: 17:23
 * \
 */
public class Person implements Serializable {
    Address address;
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    private static final long serialVersionUID = -2784103214014514310L;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    static String name;
    transient int age;

    public Person(String name, int age,Address address) {
        this.address=address;
        this.name = name;
        this.age = age;
    }
}