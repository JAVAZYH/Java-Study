package zyh.JAVAadvanced.Thread.itguigu.synchronizedTest.exar;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/7/16
 * \* Time: 9:57
 * \
 */
//使用继承方式，同步代码块方法
public class ExtendBlock {
    public static void main(String[] args) {
        Mythread t1 = new Mythread();
        Mythread t2 = new Mythread();
        Mythread t3 = new Mythread();

        t1.setName( "窗口1" );
        t2.setName( "窗口2" );
        t3.setName( "窗口3" );

        t1.start();
        t2.start();
        t3.start();
    }
}
class Mythread extends Thread{
    private static int tick=100;
    @Override
    public void run() {

       while (true){
           synchronized (Mythread.class) {
               if (tick >= 1) {
                   System.out.println( getName() + "=====" + tick );
                   tick--;
               } else {
                   return;
               }
           }
       }
    }
}