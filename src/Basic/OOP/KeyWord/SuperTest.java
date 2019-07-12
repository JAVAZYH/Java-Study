package Basic.OOP.KeyWord;

import org.junit.jupiter.api.Test;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/6/24
 * \* Time: 17:01
 * \
 */
public class SuperTest {
    class A{
        A(){
            System.out.println("i am a");
        }
        A(int a){
            System.out.println(a);
        }
    }
    class B extends A{
        B(){
            super(1);
            System.out.println("i am b");
        }
    }
    class C extends B{
        C(){
            super();
            System.out.println("i am  c");
        }
    }
    @Test
    public void test(){
        C a=new C();
//    new A();
//    new B();
//    new C();
    }
}