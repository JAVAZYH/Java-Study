package JAVAadvanced.Thread.itguigu.exar;

import java.util.ArrayList;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/7/15
 * \* Time: 15:26
 * \
 */

/**
 * 4：编写程序，在main方法中创建一个线程。线程每隔一定时间（200ms以内的随机时间）产生一个0-100之间的随机整数，打印后将该整数放到集合中；
 * 共产生100个整数，全部产生后，睡眠30秒，然后将集合内容打印输出；
 */
public class test1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Thread t=new Thread( new Runnable() {
                    @Override
                    public void run() {
                     for(int i=0;i<100;i++){
                         try {
                             int number= (int) Math.round( Math.random()*100 );
                             Thread.sleep( number*2  );
                             System.out.println("第"+i+"次产生的随机整数是："+number);
                             list.add( number );
                         } catch (InterruptedException e) {
                             e.printStackTrace();
                         }
                     }
//                     if (list.size()==100){
//                            try {
//                                Thread.sleep( 30000 );
//                                System.out.println( "已全部生成："+list );
//                            } catch (InterruptedException e) {
//                                e.printStackTrace();
//                            }
//                        }
                    }
                } );
                t.start();
        try {
            t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(list);
    }
}