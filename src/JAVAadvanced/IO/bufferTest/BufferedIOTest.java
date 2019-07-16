package JAVAadvanced.IO.bufferTest;

import org.junit.jupiter.api.Test;

import java.io.*;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/7/13
 * \* Time: 14:50
 * \
 */
//读取等量的数据时，使用缓冲区可以减少系统调用的次数，从而减少调用的时间。
public class BufferedIOTest {
    /**
     * 缓冲流（处理流）：提高读取速度
     * 读取内容
     */
    @Test
    public  void test() throws Exception {
        //创建节点流的对象
        FileInputStream fis = new FileInputStream( "ccc.txt" );
        //创建缓冲流的对象
        BufferedInputStream bis = new BufferedInputStream( fis );
        //2.读取内容
        byte[] b = new byte[1024];
        int len=-1;
        while ((len=bis.read(b))!=-1){
            System.out.println(new String( b,0,len ));
        }

        //3.关流-先关外面的再关里面的
        bis.close();
        fis.close();
    }

    /**
     * 缓冲流
     * 写入流
     */
    @Test
    public  void test2() throws Exception {
        FileOutputStream fos = new FileOutputStream( "aaa.txt" );
        BufferedOutputStream bos = new BufferedOutputStream( fos );
        bos.write( "abc".getBytes() );
        bos.close();
        fos.close();
    }


    /**
     * 使用缓冲流一边读一边写
     */
    public void copyFile(String desc,String src){
        FileInputStream fis=null;
        FileOutputStream fos=null;
        BufferedInputStream bis=null;
        BufferedOutputStream bos=null;
        try {
            //1.创建File对象
            File read = new File( src );
            File writer = new File( desc );
            //2.创建流的对象
            fis = new FileInputStream( read );
            fos = new FileOutputStream( writer );
            //创建缓冲流用来读取内容
             bis = new BufferedInputStream( fis );
             bos = new BufferedOutputStream( fos );
            /**
             * BufferedInputStram（, ,size）
             * 可以设置缓冲流的大小
             */
            //一边读一边写
            byte[] b = new byte[1024];
            int len=-1;
            while ((len=bis.read( b ))!=-1){
                //写数据
                bos.write( b,0,len );
            }

        }
        catch (IOException e) {
            e.printStackTrace();
        }finally {
            //关流--先关外面的，再关里面的
            if (bis!=null){
                try {
                    bis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bos!=null)  try {
                bos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
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

    @Test
    public  void test4(){
//         long start=
    }
}