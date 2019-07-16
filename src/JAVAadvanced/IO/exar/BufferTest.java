package JAVAadvanced.IO.exar;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/7/15
 * \* Time: 13:57
 * \
 */

import org.junit.jupiter.api.Test;

import java.io.*;

/**
 * 缓冲流：BufferedInputStream BufferedOutputStream   BufferedReader BufferedWriter
 */
public class BufferTest {
    //BufferOutputStream输出缓冲流
    @Test
    public  void test2(){
        FileOutputStream fos=null;
        BufferedOutputStream bos=null;
        try {
            fos=new FileOutputStream( "buffer.txt" );
             bos = new BufferedOutputStream( fos );
            bos.write( "我爱中国啊啊".getBytes() );
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (bos!=null){
                try {
                    bos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fos!=null){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }



    //BufferInputStream  输入缓冲流
    @Test
    public  void test(){
        FileInputStream  fis=null;
        BufferedInputStream bis=null;
        try {
            fis=new FileInputStream( "a.txt" );
             bis=new BufferedInputStream( fis );
             int len=-1;
            byte[] b = new byte[1024];
            while ((len=bis.read(b))!=-1){
                System.out.println(new String( b,0,len ));
            }

        }  catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            if (bis!=null){
                try {
                    bis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fis!=null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    //BufferedWriter 字符输入缓冲流
    @Test
    public  void test6(){
         FileWriter fw=null;
         BufferedWriter bw=null;

        try {
            fw=new FileWriter( "cbw.txt" );
            bw=new BufferedWriter( fw );
            bw.write( "字符输入缓冲流测试" );
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
            if (fw!=null){
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    //BufferedReader 缓冲字符输入流测试
    @Test
    public  void test5(){
         BufferedReader br=null;
         FileReader fr=null;
        try {
            fr=new FileReader( "cbw.txt" );
            br=new BufferedReader( fr );
           String str=null;
           while ((str=br.readLine())!=null){
               System.out.println(str);
           }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if (fr!=null){
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}