package zyh.JAVAadvanced.Reflection;

import org.junit.jupiter.api.Test;

import java.io.InputStream;
import java.lang.reflect.Field;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: javazyh
 * \* Date: 2019/5/17
 * \* Time: 15:15
 * \
 */
public class ReflectionClass {
    Class clazz=null;
    @Test
    public void testClass() throws ClassNotFoundException {
//    clazz= Student.class;
    //getDeclaredFields()：获得某个类的所有声明的字段，
    // 即包括public、private和proteced，但是不包括父类的申明字段.
        /**
         * 获取Class对象的方式
         * 1.通过类名2.通过对象名.3.通过全类名
         */
//        Object obj=new Student(  );
//        clazz=obj.getClass();
        String className="zyh.JAVAadvanced.Reflection.Entity.Student";
        clazz=Class.forName( className );
        Field[] fields=clazz.getDeclaredFields();
        System.out.println();
}
/**
 * 调用class的newInstance方法
 *
 */
@Test
public void testNewInstance() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
    String className="zyh.JAVAadvanced.Reflection.Entity.Student";
    clazz=Class.forName( className );
    Object object=clazz.newInstance();
    //调用了Student类中的无参构造方式创建了一个Student实例.
    System.out.println(object);
}
/**
 * 测试类加载器，类加载器有引导类加载器，扩展类加载器，系统类加载器。
 */
@Test
public void testClassLoader() throws ClassNotFoundException {
    //获取系统类
    ClassLoader classLoader=ClassLoader.getSystemClassLoader();
    System.out.println(classLoader);
    //获取系统类的父类，扩展类加载器
    classLoader=classLoader.getParent();
    System.out.println(classLoader);
    //获取扩展类的父类，引导类加载器
    classLoader=classLoader.getParent();
    System.out.println(classLoader);
    //测试当前类由哪个类加载器加载，系统类加载器
    classLoader=Class.forName( "zyh.JAVAadvanced.Reflection.Entity.Student" ).getClassLoader();
    System.out.println(classLoader);
    //测试object的类加载器，引导类
    classLoader=Class.forName( "java.lang.Object" ).getClassLoader();
    System.out.println(classLoader);

}
//获取test.text文件的输入流
    @Test
public void testClassLoader2(){
    InputStream in=null;
    in=this.getClass().getClassLoader().getResourceAsStream( "zyh/JAVAadvanced/Reflection/test.txt" );
    System.out.println(in);
}
}