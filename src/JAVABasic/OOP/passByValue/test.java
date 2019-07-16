package JAVABasic.OOP.passByValue;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/7/4
 * \* Time: 11:08
 * \
 */
public class test {


    public static void main(String[] args) {
//        int i=10;
//        changeI( i );
//        System.out.println(i);
//        Person p=new Person();
////        changPerson( p );
////        System.out.println(p.name);
        Person p1=new Person( "p1person" );
        Person p2=new Person( "p2person" );
        System.out.println(p1.name);
        System.out.println(p2.name);
        swap( p1,p2 );
        System.out.println("-------swap-----------");
        System.out.println(p1.name);
        System.out.println(p2.name);

    }
    //x对传入的i值进行了拷贝，并不会改变i的值
//    public static void changeI(int i){
//        i=i*2;
//    }
     public static void swap(Person p1,Person p2){
        Person tmp=p1;
        p1=p2;
        p2=tmp;
     }
//    public static void changPerson(Person p){
//        p.name="changePerson";
//    }

}
class  Person{
    String name;
    Person(String name){
        this.name=name;
    }
}