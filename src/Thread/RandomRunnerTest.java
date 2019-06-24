package Thread;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/6/5
 * \* Time: 12:16
 * \
 */
//主线程从键盘读取q命令，输出1到100的随机数，q停止
public class RandomRunnerTest {
    public static void main(String[] args) {
        Runnable runner=new RandomRunner();
        Thread thread=new Thread( runner );
        thread.start();
        Runnable listener=new KeyListener(runner);
        Thread thread1=new Thread( listener );
        thread1.start();

    }
    public static void main1(String[] args) {
        Runnable runner=new RandomRunner();
        Thread thread=new Thread( runner );
        thread.start();
        InputStream in=System.in;
        InputStreamReader isr=null;
        BufferedReader bufReader=null;
        try {
            isr=new InputStreamReader( in );
            bufReader=new BufferedReader( isr );
            String readLine=bufReader.readLine();
            while (readLine!=null){
                //处理数据
                if (readLine.equalsIgnoreCase( "Q" )){
                    ((RandomRunner) runner).setFlag( false );
                break;
                }
                readLine=bufReader.readLine();
                //继续读
            }
        }catch (Exception e){
          e.printStackTrace();
        }finally {
            if (bufReader!=null){
                try {
                    bufReader.close();
                }catch (Exception e2){

                }
            }
        }

    }
}