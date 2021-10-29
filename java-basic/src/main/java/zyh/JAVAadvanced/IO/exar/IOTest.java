package zyh.JAVAadvanced.IO.exar;

import org.junit.jupiter.api.Test;

import java.io.*;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/7/13
 * \* Time: 16:57
 * \
 */
public class IOTest {
    /**
     * 节点流: FileInputStream FileOutputStream  FileReader FilerWriter
     */
    //写入文件
    @Test
    public  void test2(){
        FileOutputStream fos=null;
        try {
           fos = new FileOutputStream( "D:/test/test.txt" );
            fos.write( "我是中国人".getBytes() );
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (fos!=null){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    //读取文件 FileInputStream
    @Test
    public  void test(){
        FileInputStream fis=null;
        try {
         fis = new FileInputStream( "D:/test/test.txt" );
            byte[] b = new byte[1024];
            int len=-1;
            while ((len=fis.read( b ))!=-1){
                System.out.println(new String(b,0,len));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (fis!=null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    //FileWriter 字符流写入文件
    @Test
    public  void test3(){
        FileWriter fw=null;
        try {
            fw= new FileWriter( "b.txt" );
            fw.write( "我爱中国" );
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (fw!=null){
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    //FileReader 字符流读取文件
    @Test
    public void test4(){
     FileReader fr=null;
     try {
         fr=new FileReader("b.txt");
         int len=-1;
         char[] c = new char[1024];
         while ((len=fr.read(c))!=-1){
             System.out.println(new String( c,0,len ));
         }
     }catch (Exception e){
         e.printStackTrace();
     }
    }

    //InputStreamReader 字节流转字符流
    @Test
    public  void test5(){

    }
}