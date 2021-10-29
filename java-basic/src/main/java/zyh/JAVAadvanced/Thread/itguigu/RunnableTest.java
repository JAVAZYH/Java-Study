package zyh.JAVAadvanced.Thread.itguigu;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/7/15
 * \* Time: 11:28
 * \
 */
public class RunnableTest {
    public static void main(String[] args) {
//        //创建Runnable实现类的对象
//        //将该对象传到Thread类中
//        MyRunnable runn = new MyRunnable();
//        Thread t = new Thread(runn);
//        t.start();
//    }


        //匿名内部类实现接口
        new Thread( new Runnable() {
            @Override
            public void run() {
            for(int i=0;i<100;i++){
                System.out.println("aaaaa"+i);
            }
            }
        } ).start();

        new Thread( new Runnable() {
             @Override
             public void run() {
              for(int i=0;i<100;i++){
                  System.out.println("bbbb"+i);
              }
             }
         } ).start();

}
//class MyRunnable implements java.lang.Runnable{
//
//    @Override
//    public void run() {
//      for(int i=0;i<100;i++){
//          System.out.println(i);
//      }
//    }
}