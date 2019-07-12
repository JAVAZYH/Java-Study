package JAVAadvanced.Thread.Study.extendThread;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/7/5
 * \* Time: 21:11
 * \
 */
//继承Thread类
public class ThreadTest {
    public static void main(String[] args) {
//        MyThread m1 = new MyThread();
//        m1.start();
//        MyThread m2 = new MyThread();
//        m2.start();

//        m1.run();
//        System.out.println("hello");
//        for(int i=0;i<100;i++){
//            if (i%2!=0){
//                System.out.println(i+"***main()");
//            }
//        }
      new Thread(){
                    @Override
                    public void run() {
                     for(int i=0;i<100;i++){
                         if (i%2==0){
                             System.out.println(Thread.currentThread().getName()+i);
                         }
                     }
                    }
        }.start();
        new Thread(){
                    @Override
                    public void run() {
                        for(int i=0;i<100;i++){
                            if (i%2!=0){
                                System.out.println(Thread.currentThread().getName()+i);
                            }
                        }
                    }
        }.start();
    }
}
//class MyThread extends Thread{
//    @Override
//    public void run() {
//        for(int i=0;i<100;i++){
//            if (i%2==0){
//                System.out.println(i);
//            }
//        }
//    }
//}