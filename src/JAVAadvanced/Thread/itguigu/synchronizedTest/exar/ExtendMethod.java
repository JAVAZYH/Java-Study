package JAVAadvanced.Thread.itguigu.synchronizedTest.exar;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/7/16
 * \* Time: 10:01
 * \
 */
//继承方式，采用静态同步方法
public class ExtendMethod {
        public static void main(String[] args) {
            Mythread1 t1 = new Mythread1();
            Mythread1 t2 = new Mythread1();
            Mythread1 t3 = new Mythread1();
            t1.setName( "窗口1" );
            t2.setName( "窗口2" );
            t3.setName( "窗口3" );

            t1.start();
            t2.start();
            t3.start();
        }
    }

class Mythread1 extends Thread{
    private static int tick=100;
    @Override
    public void run() {
        while (true){
            boolean b = sellTick();
            if (b==false){
                return;
            }
        }
    }

    public  static synchronized boolean sellTick(){
        if (tick >= 1) {
            System.out.println( Thread.currentThread().getName() + "=====" + tick );
            tick--;
            return true;
        } else {
            return false;
        }
    }
}