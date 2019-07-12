package JAVAadvanced.Thread.Study.implRunnable;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/7/6
 * \* Time: 14:34
 * \
 */
public class ThreadTest {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        Thread thread = new Thread( myThread );
        thread.setName( "线程1:  " );
        thread.start();
        Thread thread1 = new Thread( myThread );
        thread1.setName( "线程2:  " );
        thread1.start();
    }

}

class  MyThread implements Runnable{

    @Override
    public void run() {
for(int i=0;i<100;i++){
    System.out.println(Thread.currentThread().getName()+i);
}
    }
}