package zyh.JAVAadvanced.Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/7/5
 * \* Time: 16:27
 * \
 */

/**
 * throws并没有真正的处理异常，而是抓住异常向上抛，抛给方法的调用者处理
 */
public class ThrowsTest {
    public  void test(){
        try {
            add3();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public void add3() throws FileNotFoundException {
        add2();
    }
    public  void add2() throws FileNotFoundException {
        add();
    }
    public  void add () throws FileNotFoundException {
        new FileInputStream( "123.text" );
    }
}