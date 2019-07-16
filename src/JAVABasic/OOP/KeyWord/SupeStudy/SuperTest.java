package JAVABasic.OOP.KeyWord.SupeStudy;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/6/26
 * \* Time: 10:26
 * \
 */
public class SuperTest  extends Test {
   SuperTest(){
//       this.SuperInfo();
     super("a");
       System.out.println("i am superTest constructor");
   }
   void info(){
//       this.info();

//       SuperInfo();
       System.out.println("i am superTest");
   }

    public static void main(String[] args) {
        new SuperTest();
    }
}