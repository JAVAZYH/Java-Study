package Basic.OOP;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/6/26
 * \* Time: 9:52
 * \
 */
public class ObjectRelated {
    public static void main(String[] args) {
        Person person=new Person();
        Dog dog=new Dog();
//        dog.dogname="二哈";
        person.name="人";
//        person.d=dog;
        person.dog.dogname="田园犬";
        System.out.println(dog.dogname);
    }
}

class  Person{
    String name;
    Dog dog;
}
class Dog{
    String dogname;
    Dog(){
        dogname="dddd";
    }
}