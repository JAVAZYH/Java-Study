package JAVAadvanced.Thread.itguigu.synchronizedTest;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/7/16
 * \* Time: 9:21
 * \
 */
public class Test {
    public static void main(String[] args) {
        Mythreade t1 = new Mythreade();
        Mythreade t2= new Mythreade();
        Mythreade t3 = new Mythreade();

        t1.setName( "窗口1" );
        t2.setName( "窗口2" );
        t3.setName( "窗口3" );

        t1.start();
        t2.start();
        t3.start();
    }


}
class Mythreade extends  Thread{
    private  static int ticket=100;//让多个对象使用共享数据
    private static Object obj=new Object();
    @Override
    public void run() {
      while (true){
          //继承Thread的方式锁不能用this，因为对象有多份
          //实现Runnable的方式可以
          synchronized (obj) {
              if (ticket >= 1) {
                  System.out.println( Thread.currentThread().getName() + "====" + ticket );
                  ticket--;
              } else {
                  return;
              }
          }
      }
    }
}