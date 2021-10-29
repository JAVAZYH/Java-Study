package zyh.JAVAadvanced.Collection.Set.study;

import java.util.Objects;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/7/10
 * \* Time: 14:19
 * \
 */
public class Person {
        String name;
        String age;

        public Person(String name, String age) {
            this.name = name;
            this.age = age;
        }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return name.equals( person.name ) &&
                age.equals( person.age );
    }

    @Override
    public int hashCode() {
        return Objects.hash( name, age );
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}