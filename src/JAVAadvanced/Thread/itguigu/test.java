package JAVAadvanced.Thread.itguigu;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/7/15
 * \* Time: 11:04
 * \
 */
public class test {
    public static void main(String[] args) {
        new Thread(){
                    @Override
                    public void run() {
                     for(int i=0;i<100;i++){
                         if (i%2==0){
                             System.out.println(Thread.currentThread().getName()+"-----100以内的偶数"+i);
                         }
                     }
                    }
        }.start();

        new Thread(){
            @Override
            public void run() {
             for(int i=0;i<100;i++){
                 if (i%2!=0){
                     System.out.println(Thread.currentThread().getName()+"----100以内的奇数"+i);
                 }
             }
            }
        }.start();
    }


}