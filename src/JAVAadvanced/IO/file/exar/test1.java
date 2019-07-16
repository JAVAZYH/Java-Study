package JAVAadvanced.IO.file.exar;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/7/15
 * \* Time: 18:15
 * \
 */

public class test1 {
/**
 * 1. 利用File构造器，new 一个文件目录file
 *      1)在其中创建多个文件和目录
 *      2)编写方法，实现删除file中指定文件的操作
 *
 * 2. 判断指定目录下是否有后缀名为.jpg的文件
 * ，如果有，就输出该文件名称
 */

/**
 * * 1. 利用File构造器，new 一个文件目录file
 *  *      1)在其中创建多个文件和目录
 *  *      2)编写方法，实现删除file中指定文件的操作
 */
@Test
public  void test(){
    File file = new File( "d:/fileTest" );
    if (!file.exists()){
        file.mkdirs();
    }
    File dir1 = new File( file, "dir1" );
    if (dir1.exists()==false){
        dir1.mkdirs();
    }
    File file1 = new File( file, "test.txt" );
    try {
        file1.createNewFile();
    } catch (IOException e) {
        e.printStackTrace();
    }

    file1.delete();
}

    /**
     * 2. 判断指定目录下是否有后缀名为.jpg的文件
     * 如果有，就输出该文件名称
     */
   static ArrayList<String> arrayList = new ArrayList<>();
public static List<String> getFile(String path){

    File file=new File( path );
     File[] list=file.listFiles();
   for(int i=0;i<list.length;i++){
       String fileName=list[i].getName();
       arrayList.add( fileName );
       if (list[i].isDirectory()){
           getFile( list[i].getAbsolutePath() );
       }else{
            if (fileName.contains( ".jpg" )){
                System.out.println(fileName);
            }
       }

   }
   return arrayList;
//         if (f.isDirectory()){
//             File[] list2=f.listFiles();
//         }
//      if (f.contains( ".jpg" )){
//          System.out.println(f);
//      }
     }

     //3.读取d盘下的所有文件
     static ArrayList<String> list = new ArrayList<>();
    @Test
    public  static List<String> getAll(String path){
         File file=new File( path);
         File[] files=file.listFiles();
         for(int i=0;i<files.length;i++){
             String fileName=files[i].getName();
             if (files[i].isDirectory()){
                 getAll( files[i].getAbsolutePath() );
                 list.add( "该目录的名字是："+fileName );
             }else{
                 list.add( "该文件的名称是："+fileName );
             }
         }
         return list;
    }
    public static void main(String[] args) {
//        System.out.println(getFile( "d:/fileTest" ));
        System.out.println(getAll( "d:/Game" ));
    }
}
