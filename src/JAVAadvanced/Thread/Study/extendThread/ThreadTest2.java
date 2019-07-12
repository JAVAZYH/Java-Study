package JAVAadvanced.Thread.Study.extendThread;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/7/6
 * \* Time: 10:45
 * \
 */
public class ThreadTest2 {
    public static void main(String[] args) {
        MyThread myThread = new MyThread("myThread");
        myThread.setName( "myThread" );
        myThread.setPriority( Thread.MAX_PRIORITY );
        myThread.start();
        Thread.currentThread().setName( "主线程" );
        for(int i=0;i<100;i++){
//            try {
//                Thread.sleep( 1000 );
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            System.out.println(Thread.currentThread().getName()+"---"+Thread.currentThread().getPriority()+"---"+i);
//            if (i==20){
//                try {
//                    myThread.join();
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
        }
        System.out.println(myThread.isAlive());
    }
}
class  MyThread extends Thread{
    MyThread(String name){
        super(name);
    }
    @Override
    public void run() {
        for(int i=0;i<100;i++){
//            if (i==20){
//                try {
//                    sleep( 1000 );
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
            System.out.println(Thread.currentThread().getName()+"---"+Thread.currentThread().getPriority()+"---"+i);
//            if (i%20==0){
//              yield();
//            }
        }

    }
}