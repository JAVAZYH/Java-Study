package Basic.OOP.KeyWord.finalTest;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/7/4
 * \* Time: 10:53
 * \
 */
public class test {
    public static void main(String[] args) {
        final Person p=new Person();
        System.out.println(p.name);
    p.name="222";
    chang( p );
        System.out.println("---更改后——-");
        System.out.println(p.name);

  }
    static  void  chang( Person p){
       p=new Person();
    }

}
class  Person{
    String name="111";
}