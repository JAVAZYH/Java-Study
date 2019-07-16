package JAVAadvanced.Thread.itguigu.synchronizedTest.exar;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/7/16
 * \* Time: 10:05
 * \
 */
//实现接口方式，采用同步代码块
public class ImplBlock {
    public static void main(String[] args) {
        Mythread2 mt=new Mythread2();

        Thread t1=new Thread(mt);
        Thread t2=new Thread(mt);
        Thread t3=new Thread(mt);

        t1.setName( "窗口1" );
        t2.setName( "窗口2" );
        t3.setName( "窗口3" );

        t1.start();
        t2.start();
        t3.start();
    }



}
class  Mythread2 implements Runnable{

    private static int tick=100;
    @Override
    public void run() {
        while (true){
            synchronized (this) {
                if (tick >= 1) {
                    System.out.println(Thread.currentThread().getName()+ "=====" + tick );
                    tick--;
                } else {
                    return;
                }
            }
        }
    }
}