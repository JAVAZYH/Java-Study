package JAVAadvanced.IO.StreamTo;

import org.junit.jupiter.api.Test;

import java.io.*;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/7/13
 * \* Time: 16:26
 * \
 */
public class test {
    /**
     * 字节流和字符流之间的转换
     * InputStreamReader
     */
    @Test
    public  void test() throws Exception {
        FileInputStream fis = new FileInputStream( "aaa.txt" );
        //将字节流转为字符流
        InputStreamReader isr = new InputStreamReader( fis );

        //向文件中写内容
        FileOutputStream fos = new FileOutputStream( "eee.txt" );
        OutputStreamWriter osw = new OutputStreamWriter( fos );

        //一边读一边写
        char[] c = new char[1024];
        int len=-1;
        while ((len=isr.read(c))!=-1){
            osw.write( c,0,len );
        }
        //关流
        osw.close();
        isr.close();
        fos.close();
        fis.close();
    }

    /**
     * 2.使用转换流来处理文件乱码问题
     *注意：isr设置编码集的时候必须读取和设置文件的编码集一致
     */
    //将GBK的文件格式转换为UTF-8的文件
    @Test
    public  void test2() throws FileNotFoundException, UnsupportedEncodingException {
        FileInputStream fis = new FileInputStream( "aaa.txt" );
        //将字节流转为字符流
        InputStreamReader isr = new InputStreamReader( fis,"GBK" );

        //向文件中写内容
        FileOutputStream fos = new FileOutputStream( "eee.txt" );
        OutputStreamWriter osw = new OutputStreamWriter( fos,"utf-8" );

    }
}