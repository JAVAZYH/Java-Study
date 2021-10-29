package zyh.JAVABasic.Type.String;

import org.junit.jupiter.api.Test;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/6/25
 * \* Time: 14:57
 * \
 */
public class StringTest {


    public static void main(String[] args) {
        String str="hello!word!";
//        System.out.println(str.substring( 1,2 ));
        str=str.substring( 0,6)+"java!";
        System.out.println(str);

    }
    //检查是否为空
    @Test
    public void test(){
        String str="";
        System.out.println(str.length());
        if (str!=null&&str.length()!=0){
            System.out.println("不为空串:"+str);
        }else{
            System.out.println("为空串");
        }
    }
    
}