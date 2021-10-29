package zyh.JAVAadvanced.Thread.itguigu.exar;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/7/15
 * \* Time: 15:36
 * \
 */

import java.util.Random;
import java.util.Scanner;

/**
 * 在main方法中创建并启动两个线程。
 * 第一个线程循环随机打印100以内的整数，
 * 直到第二个线程从键盘读取了“Q”命令。
 */
public class test2 {
    public static void main(String[] args) {
   Thread t= new Thread(){
                @Override
                public void run() {
                 while (true){
                     Random random = new Random();
                     System.out.println(random.nextInt(100));
                     try {
                         //当线程在sleep时，如果被其他线程打断就会抛出异常
                         sleep( 5000 );
                     } catch (InterruptedException e) {
//                         e.printStackTrace();
                         return;//终止当前线程
                     }
                 }
                }
    };

  Thread t2= new Thread(){
               @Override
               public void run() {
                   Scanner s=new Scanner( System.in );
                   String str=s.next();
                   if ("q".equals( str )){
                       t.interrupt();
                   }
               }
   };

  t.setName( "线程1 " );
  t.setName( "线程2" );
  t.start();
  t2.start();
}
}
