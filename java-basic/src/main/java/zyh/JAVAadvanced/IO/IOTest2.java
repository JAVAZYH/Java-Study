package zyh.JAVAadvanced.IO;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/7/13
 * \* Time: 14:23
 * \
 */

/**
 * FileOutputStream
 */
public class IOTest2 {
    @Test
    public  void test(){
        File file = new File( "ccc.txt" );//读内容的文件可以不存在，写内容的文件必须存在
        try {
            /**
             * FileOutputStream(File file,boolean append)
             *append为true：内容追加， false：覆盖内容
             * 覆盖：这一次的操作覆盖上一次的操作
             */
            FileOutputStream fos = new FileOutputStream( file ,true);
            //3.写内容
            fos.write( "aaa".getBytes() );
            fos.write( "cc".getBytes() );
            fos.write( "bb".getBytes() );
            //一次操作

            //4.关流
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}