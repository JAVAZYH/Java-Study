package JAVAadvanced.IO.file;

import org.junit.jupiter.api.Test;

import java.io.File;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/7/13
 * \* Time: 10:21
 * \
 */
public class FileAPI {
    @Test
    public  void test(){
        File file = new File( "D:/input.txt" );//绝对路径
        File file1 = new File( "JAVAadvanced/IO/test.txt" );//相对路径 当前工程下的test.txt
        System.out.println(file.getAbsolutePath());//获取绝对路径
        System.out.println(file.getAbsoluteFile());
        System.out.println(file.getPath());
        System.out.println(file.getName());
        System.out.println(file.getParent());

        System.out.println("----------");
    }

    @Test
    public  void test2(){
        File file = new File( "d:/dict" );
        String[] list=file.list();//获取目录下的文件名
        for (String name:list) {
            System.out.println(name);
        }

        File[] listFiles=file.listFiles();//获取目录下的所有文件
        for (File f:listFiles
             ) {
            System.out.println(f);
        }
    }
}