package Basic.OOP.Contructor;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/6/26
 * \* Time: 9:29
 * \
 */
public class ContructorTest {
    ContructorTest(){

        this(10);
        System.out.println(111);
    }
    ContructorTest(int a){
        a++;
        System.out.println(a);
    }

    public static void main(String[] args) {
        new ContructorTest(  );
    }
}