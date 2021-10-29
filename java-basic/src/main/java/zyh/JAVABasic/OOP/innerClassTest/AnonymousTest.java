package zyh.JAVABasic.OOP.innerClassTest;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/7/5
 * \* Time: 9:36
 * \
 */
public class AnonymousTest {
    public static void main(String[] args) {
       IUSB keyword= new IUSB(){

            @Override
            public void start() {
                System.out.println("keyword start");
            }

            @Override
            public void end() {
                System.out.println("keyword end");
            }
        };

       SuperClass subClass=new SuperClass() {
           @Override
           public void test() {
               super.test();
               System.out.println("subclass ");
           }
       };
      new Thread(){

            @Override
            public void run() {
                System.out.println("111");
            }
        }.start();
        new Thread(){

            @Override
            public void run() {
                System.out.println("222");
            }
        }.start();
        new Thread(){

            @Override
            public void run() {
                System.out.println("33");
            }
        }.start();


//       keyword.start();
//       keyword.end();
//       subClass.FileTest();
    }
}
interface  IUSB{
      void start();
    void end();
}
abstract class SuperClass{
     public  void test(){
         System.out.println("super class");
    }
}