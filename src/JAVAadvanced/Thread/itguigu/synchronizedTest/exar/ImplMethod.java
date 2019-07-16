package JAVAadvanced.Thread.itguigu.synchronizedTest.exar;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/7/16
 * \* Time: 10:13
 * \
 */
//实现接口 同步方法
public class ImplMethod {
    public static void main(String[] args) {
        Mythread3 mt=new Mythread3();

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
class Mythread3 extends Thread{
    private static int tick=100;
    @Override
    public void run() {
        while (true){
            boolean b = sellTick();
            if(!b){
                return;
            }
        }
    }

    public  synchronized boolean sellTick(){
        if (tick >= 1) {
            System.out.println(Thread.currentThread().getName()+ "=====" + tick );
            tick--;
            return true;
        } else {
            return false;
        }
    }
}