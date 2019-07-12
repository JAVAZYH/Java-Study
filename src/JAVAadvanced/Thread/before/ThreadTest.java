package JAVAadvanced.Thread.before;

public class ThreadTest extends Thread{
    public static void main(String[] args) {
        ThreadTest tt=new ThreadTest();
        //启动线程 并调用run方法
        tt.start();//不能直接调用run方法
        for (int i=1;i<10000;i++){
            System.out.println("main---------"+i);
        }
    }

    //在run方法中编写程序要执行的代码
    @Override
    public void run() {
        for (int i=1;i<10000;i++){
            System.out.println("threadTest-------"+i);
        }
    }
}
