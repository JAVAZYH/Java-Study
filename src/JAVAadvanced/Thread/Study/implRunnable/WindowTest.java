package JAVAadvanced.Thread.Study.implRunnable;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/7/6
 * \* Time: 15:36
 * \
 */
//实现runnable接口的方法
public class WindowTest {
    public static void main(String[] args) {
        Window window = new Window();

        Thread thread = new Thread( window );
        Thread thread1 = new Thread( window );
        Thread thread2 = new Thread( window );

        thread.setName( "窗口1" );
        thread1.setName( "窗口2" );
        thread2.setName( "窗口3" );

        thread.start();
        thread1.start();
        thread2.start();
    }
}
class Window implements Runnable{
    private int ticket=100;
    @Override
    public void run() {
        while (true){
            if (ticket>0){
                try {
                    Thread.sleep( 100 );
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"买票，票号为："+ticket);
                ticket--;
            }else {
                break;
            }
        }
    }
}