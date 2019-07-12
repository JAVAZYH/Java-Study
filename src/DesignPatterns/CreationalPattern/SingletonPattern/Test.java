package DesignPatterns.CreationalPattern.SingletonPattern;

import DesignPatterns.CreationalPattern.SingletonPattern.LazySingleton.Singleton2;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/7/1
 * \* Time: 20:30
 * \
 */
public class Test {
    public static void main(String[] args) {
        //第一个线程
        new Thread(  ){
            @Override
            public void run() {
                System.out.println( Singleton2.getInstance() );
            }
        }.start();
        //第二个线程
        new Thread(  ){
            @Override
            public void run() {
                System.out.println( Singleton2.getInstance() );
            }
        }.start();
        //第三个线程
        new Thread(  ){
            @Override
            public void run() {
                System.out.println( Singleton2.getInstance() );
            }
        }.start();

//        System.out.println( Singleton2.getInstance() );
//        System.out.println( Singleton2.getInstance() );
//        System.out.println( Singleton2.getInstance() );
    }
}