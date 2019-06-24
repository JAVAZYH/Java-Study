package Thread;

import java.util.concurrent.ForkJoinPool;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/6/5
 * \* Time: 12:02
 * \
 */

/**
 * 1 创建一个类继承于thread类并且覆盖run方法
 * 2 创建这个类的对象并且调用start方法，这个类的对象就是一个线程对象
 * 继承一般不用，继承一般是单继承，用实现run方法的方式更好
 */
class MyThread extends  Thread{
    @Override
    public void run() {
      for (int i=0;i<100;i++){
          System.out.println(Thread.currentThread().getName()+":"+i);
      }
    }
}
public class ExtendsThread{
    public static void main(String[] args) {
        Thread thread=new MyThread();
        thread.start();
        for(int i=0;i<100;i++){
            System.out.println(Thread.currentThread().getName()+";"+i);
        }
    }
}