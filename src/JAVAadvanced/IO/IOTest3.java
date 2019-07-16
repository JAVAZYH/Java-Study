package JAVAadvanced.IO;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/7/13
 * \* Time: 14:32
 * \
 */

/**
 * 边读边写
 */
public class IOTest3 {
    @Test
    public  void test() throws Exception {
//         //1.创建File对象
//        File read = new File( "d:/test/aaa.avi" );
//        File writer = new File( "d:/test/bbb.avi" );
//        //2.创建流的对象
//        FileInputStream fis = new FileInputStream( read );
//        FileOutputStream fos = new FileOutputStream( writer );
//        //一边读一边写
//        byte[] b = new byte[1024];
//        int len=-1;
//        while ((len=fis.read( b ))!=-1){
//            //写数据
//            fos.write( b,0,len );
//        }
//        fis.close();
//        fos.close();
        copyFile( "d:/test/ccc.avi","d:/test/aaa.avi" );

    }

    public void copyFile(String desc,String src){
        FileInputStream fis=null;
        FileOutputStream fos=null;
        try {
        //1.创建File对象
        File read = new File( src );
        File writer = new File( desc );
        //2.创建流的对象
         fis = new FileInputStream( read );
         fos = new FileOutputStream( writer );
        //一边读一边写
        byte[] b = new byte[1024];
        int len=-1;
        while ((len=fis.read( b ))!=-1){
                //写数据
                fos.write( b,0,len );
            }

        }
        catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (fis!=null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fos!=null)  try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }


    }
}