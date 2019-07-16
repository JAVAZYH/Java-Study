package JAVAadvanced.IO;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/7/13
 * \* Time: 11:23
 * \
 */
public class IOTest {
    /**
     * FileInputStream
     */
    @Test
    public  void test(){
        /**
         * 第一种方式
         */
        //1.创建File对象
        File file = new File( "test.txt" );
        //2.创建流的对象
        try {
            FileInputStream fis = new FileInputStream( file );
//            int n=0;
//            while ((n=fis.read())!=-1){
//                System.out.println((char)n);
//            }
            //第二种方式：
            /**
             * read（byte[] b）将读取的内容放到byte数组中
             * 当数组存满或者读取完毕，就将返回读取内容的长度的值
             *说明：
             * 将内容读取到b这个数组
             * 如果没有读完返回值为读取内容的长度
             * 如果读完返回值为-1
             */

            byte[] bytes = new byte[1000];
//            int length=fis.read(bytes);
//            System.out.println(length);
//            System.out.println( Arrays.toString( bytes ) );
            int len=-1;
            while((len=fis.read(bytes))!=-1){
                //将byte数组转为字符串
                /**
                 * 将数组从0索引值开始长度为len的元素转为字符串
                 */
//                System.out.println(new String( bytes,0,len ));
            }

            fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    /**
     * 标准版
     */
    @Test
    public  void test2(){
       FileInputStream fis=null;
        try {
            //1.创建File对象
            File file = new File( "test.txt" );

            //2.创建流的对象
            fis = new FileInputStream( file );
            //3.读数据
            byte[] b = new byte[1024];
            int len=-1;//用来记录读取内容的长度是否读取完毕
            while ((len=fis.read( b ))!=-1){
                System.out.println(new String( b,0,len ));
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

    @Test
    public  void test3(){
        FileInputStream fis=null;

        try {
            File file = new File( "test.txt" );
            fis=new FileInputStream( file );
            byte[] b = new byte[1024];
            int len=-1;
            while ((len=fis.read( b ))!=-1){
                System.out.println(new String(b,0,len) );
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }





}