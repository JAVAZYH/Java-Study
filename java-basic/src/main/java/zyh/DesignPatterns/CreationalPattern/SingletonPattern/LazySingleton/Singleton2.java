package zyh.DesignPatterns.CreationalPattern.SingletonPattern.LazySingleton;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/7/1
 * \* Time: 20:27
 * \
 */
//懒汉式单例，线程不安全
public class Singleton2 {
    private Singleton2(){}
    private static Singleton2 single=null;
    //同步锁，修饰的static方法锁的是类，修饰的方法不是static修饰锁的是当前的对象
     public static Singleton2 getInstance(){

             if (single==null){
                 synchronized (Singleton2.class){
                 //1,2,3
//                 try {
//                     //让线程休息10毫秒
//                     zyh.JAVAadvanced.Thread.sleep( 10 );
//                 } catch (InterruptedException e) {
//                     e.printStackTrace();
//                 }
                     if (single==null){
                         single=new Singleton2();
                     }
             }
         }
        return  single;
    }
}