package JAVAadvanced.IO.bufferTest;

import org.junit.jupiter.api.Test;

import java.io.*;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/7/13
 * \* Time: 15:26
 * \
 */

/**
 * 注意：字符流不要用来复制文件的内容
 */
public class CharIOTest {
    /**
     * 字符流：
     * 节点流：FileReader，FileWriter
     */

    @Test
    public  void test() throws Exception {
        FileReader fr = new FileReader( "ccc.txt" );
        char[] c = new char[1024];
        int len=-1;
        while ((len=fr.read(c))!=-1){
            System.out.println(new String( c,0,len ));
        }
        fr.close();
    }

    /**
     * 字节流读中文文件内容有问题
     * 字节流复制中文的文件没有问题
     * 1一个中文代表一个字符，一个字符占2个字节占16位
     * 读取的时候是一个字节一个字节的读取，一次读8位，
     * 每个8位转成char，显示出来的就是8位显示出的内容，(半个中文字符)所以展示出来的中文是乱码。
     * byte 1字节
     * short char 2
     * int float 4
     * long double 8
     *
     */


    /**
     * 使用字符缓冲流向文件中写入中文数据
     */
    @Test
    public  void test3(){
        try {
            FileWriter fw=new FileWriter( "aaa.txt" );
            BufferedWriter bw = new BufferedWriter( fw );
            bw.write( "我是中国人aaa" );
            bw.flush();
//            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 注意：字符流不要用来复制文件的内容
     * 文件本省的编码集和程序的编码集如果不一样，会产生问题
     */
    @Test
    public  void test2() throws Exception {
        FileReader fr = new FileReader( "aaa.txt" );
        FileWriter fw = new FileWriter( "ggg.txt" );
        char[] c = new char[1024];
        int len=-1;
        while ((len=fr.read(c))!=-1){
              fw.write( c,0,len );
        }
        fw.close();
        fr.close();
    }

    /**
     * 使用字符缓冲流按行读取
     */
    @Test
    public  void test4() throws Exception {
        FileReader fr = new FileReader( "aaa.txt" );
        BufferedReader br = new BufferedReader( fr );
        String str=null;
         while ((str=br.readLine())!=null){
             System.out.println(str);
         }
         br.close();
         fr.close();

        /**
         * 字符缓冲流-写内容
         * BufferedWriter.flush()--刷新内存，将内存中缓冲区的数据及时刷新到文件中
         * bw.close()方法调用了flush（）进行刷新
         */

    }
}