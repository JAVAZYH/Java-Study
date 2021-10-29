package zyh.JAVAadvanced.IO.exar;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/7/15
 * \* Time: 15:06
 * \
 */

import org.junit.jupiter.api.Test;

import java.io.*;

/**
 * InputStreamReader OutputStreamReader
 */
public class TransTest {
    //InputStreamReader把输入字节流转为输入字符缓冲流

    /**
     * 读取文件的格式必须要和文件的编码一致
     */
    @Test
    public  void test(){
        FileInputStream fis=null;
        BufferedReader br=null;
        try {
            fis=new FileInputStream( "cbw.txt" );
            InputStreamReader isr= new InputStreamReader(fis,"GBK");
            br=new BufferedReader( isr);
            String str=null;
            while ((str=br.readLine())!=null){
                System.out.println(str);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if (br!=null){
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    //OutputStreamWriter
    @Test
    public  void test2(){
       OutputStreamWriter osw=null;
       BufferedWriter bw=null;
        try {
            FileOutputStream fos=new FileOutputStream( "cbw.txt" );
            osw=new OutputStreamWriter( fos,"GBK" );
             bw=new BufferedWriter( osw );
            bw.write( "哈哈哈哈" );
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
         if (bw!=null){
             try {
                 bw.close();
             } catch (IOException e) {
                 e.printStackTrace();
             }
         }
        }
    }
}