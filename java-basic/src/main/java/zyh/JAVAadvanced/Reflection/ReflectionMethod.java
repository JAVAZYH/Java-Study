package zyh.JAVAadvanced.Reflection;

import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: javazyh
 * \* Date: 2019/5/17
 * \* Time: 16:02
 * \
 */
public class ReflectionMethod {
    @Test
    public void testMethod() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
        Class clazz=Class.forName( "zyh.JAVAadvanced.Reflection.Entity.Student" );
        //1.获取clazz对应类中所有方法数组，不能获取private，protected能获取从父类继承来的方法。
//        Method[] methods=null;
//        methods=clazz.getMethods();
//        for (Method method:methods){
//            System.out.println(","+method.getName());
//        }

        //getDeclaredMethods();获取所有方法，只能获取到当前类的方法
//        methods=clazz.getDeclaredMethods();
//        for (Method method:methods){
//            System.out.println(","+method.getName());
//        }

        //获取指定方法,需要指定方法名称和参数类型
        //    public void setName(String name) {
        //        this.name = name;
        //    }
//        Method method= clazz.getDeclaredMethod( "setName", String.class);
//        System.out.println(method);

        //执行方法
//        Method method= clazz.getDeclaredMethod( "protectedMethod");
        Method method= clazz.getDeclaredMethod( "publicMethod");
        Object obj=clazz.newInstance();
        System.out.println(obj);
        //如果方法是private或者protected类型需要setAccessible
//        method.setAccessible( true );
        method.invoke( obj );
    }
}