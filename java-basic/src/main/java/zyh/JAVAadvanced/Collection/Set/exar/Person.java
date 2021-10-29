package zyh.JAVAadvanced.Collection.Set.exar;

import java.util.Objects;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/7/10
 * \* Time: 16:21
 * \
 */
public class Person {
    int age;
    String name;

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals( name, person.name );
    }

    @Override
    public int hashCode() {
        return Objects.hash( age, name );
    }
}