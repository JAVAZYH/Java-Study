package zyh.JAVAadvanced.Exception;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/7/5
 * \* Time: 15:57
 * \
 */
public class FinallyTest {

    public  void test(){
        try {
            System.out.println(1/0);
        } catch (Exception e) {
            System.out.println("发生异常了");
            System.out.println(1/0);
        } finally {
            System.out.println("我一定要执行");
        }
    }

    public static void main(String[] args) {
       new  FinallyTest().test();
    }
}