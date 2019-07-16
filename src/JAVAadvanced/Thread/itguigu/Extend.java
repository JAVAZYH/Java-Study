package JAVAadvanced.Thread.itguigu;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/7/15
 * \* Time: 10:48
 * \
 */
public class Extend {
    public static void main(String[] args) {
        Mythread mythread = new Mythread();
        mythread.start();
        for(int i=0;i<100;i++){
            System.out.println("main---");
        }
    }

}
class Mythread extends Thread{
    @Override
    public void run() {
        for(int i=0;i<100;i++){
            System.out.println("ccc");
        }
    }
}