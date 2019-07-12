package jvm.classloader;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/7/9
 * \* Time: 19:41
 * \
 */
public class test {
    public  static void test01(){
        test02();
        System.out.println("test01 end");
    }
    public  static void test02(){
//        test01();
        System.out.println("test02 end");
    }
    public static void main(String[] args) {
        test01();
        System.out.println("main end");



//        Object obj=new Object();
//        Demo demo = new Demo();
//        String str=new String( "abc" );
//        System.out.println(obj.getClass().getClassLoader());//启动类加载器由于是c++所以是空的
//        System.out.println(demo.getClass().getClassLoader().getParent().getParent());
//        System.out.println(demo.getClass().getClassLoader().getParent());
//        System.out.println(demo.getClass().getClassLoader());
//        System.out.println(str);
//
//        new Thread(  ).start();


    }

}
//class Demo{}
