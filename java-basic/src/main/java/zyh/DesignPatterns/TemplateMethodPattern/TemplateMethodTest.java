package zyh.DesignPatterns.TemplateMethodPattern;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/7/3
 * \* Time: 10:49
 * \
 */

import org.junit.jupiter.api.Test;


public class TemplateMethodTest  {
    @Test
    public  void test(){
//        new Computer().runTime();
        Computer c=new odd();
        c.runTime();
    }
}

/**
 * 计算10000以内奇数的执行时间
 */
class odd extends Computer{

    @Override
    public void runCode() {
        for (int i = 0; i <= 10000; i++) {
            if (i % 2 != 0) {
                System.out.println( i );
            }
        }
    }
}

/**
 * 计算10000以内偶数的执行时间
 */
class even extends  Computer{

    @Override
    public void runCode() {
        for (int i = 0; i <= 10000; i++) {
            if (i % 2 == 0) {
                System.out.println( i );
            }
        }
    }
}


abstract class Computer {
    public void runTime() {
        //从当前时间到1970年1月1日所经历的毫秒数
        long start = System.currentTimeMillis();
        //执行的代码
        this.runCode();
        long end = System.currentTimeMillis();
        System.out.println("time="+(end-start));
    }
    public abstract void runCode();
}
