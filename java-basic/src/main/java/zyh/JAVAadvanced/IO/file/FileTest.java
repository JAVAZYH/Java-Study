package zyh.JAVAadvanced.IO.file;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/7/13
 * \* Time: 9:41
 * \
 */
//java.io.File

import org.junit.jupiter.api.Test;

import java.io.File;

/**
 * File类用来表示一个文件或者一个目录
 * File往往作为一个端点，传入到流中
 * File只能用来创建文件，目录。删除文件目录，获取文件目录的信息等
 * 但是没有向文件中写入数据的功能，写入数据要依赖于IO流
 */
public class FileTest {
  public static final String directory="D:";
  @Test
  public  void test(){

//    File file = new File( "D:\\input.text" );
    File file = new File( "D:/input.txt" );
    //表示一个目录
    File file1 = new File( "D:/dict" );

    //另一个构造器
    File file2 = new File( directory, "input.txt" );

  }

  /**
   * 绝对路径：包含盘符在内的路径
   * 相对路径：相对于当前工程下面
   */
  @Test
  public  void test2(){
    File file = new File( "D:/input.txt" );//绝对路径
    File file1 = new File( "zyh/JAVAadvanced/IO/test.txt" );//相对路径 当前工程下的test.txt
    new File( "12.txt" );//不能这么写因为当前工程下没有该文件
  }




}