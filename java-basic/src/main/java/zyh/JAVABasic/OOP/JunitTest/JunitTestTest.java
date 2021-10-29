package zyh.JAVABasic.OOP.JunitTest;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/7/1
 * \* Time: 16:45
 * \
 */
//单元测试

import org.junit.jupiter.api.Test;

/**
 * 1.导包 2.写一个方法无参无返回值
 * 3.添加@Test注解
 * 4.class类必须是public修饰
 * 5.取名必须和包相对应
 * 6.不能取名为test
 * 不能写在项目中
 */
public class JunitTestTest {
    @Test
    public  void test(){
        System.out.println("aaa");
    }

}