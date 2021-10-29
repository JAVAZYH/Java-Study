package zyh.JAVAadvanced.Thread.before;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/6/5
 * \* Time: 12:32
 * \
 */
public class KeyListener implements Runnable{
    private Runnable runner;
    public KeyListener(Runnable runner){
        this.runner=runner;
    }
    @Override
    public void run() {
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
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            if (bufReader!=null){
                try {
                    bufReader.close();
                }catch (Exception e2){

                }
            }
        }
    }
}