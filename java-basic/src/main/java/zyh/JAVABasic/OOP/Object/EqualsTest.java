package zyh.JAVABasic.OOP.Object;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/7/1
 * \* Time: 15:48
 * \
 */

import org.junit.Test;

/**
 * equals和==的区别
 * ==比较基本数据类型的值是否相等
 * 如果比较的是引用数据类型，比较的是地址值，两个地址是否指向同一块内存
 *object中的equals比较两个对象的地址值
 * 一般自定义的类都会重写equals方法比较对象属性的地址值
 */
public class EqualsTest {
    public static void main(String[] args) {
//      int a=5;
//      double b=5.0;
//        System.out.println(a==b);

//        Person p1=new Person();
//        Person p2=new Person();
//        Person p3=p1;
//        System.out.println(p1==p3);
//        System.out.println(p2==p3);

        //重写equals方法比较内容
//        String s1="aaa" ;
//        String s2="aaa";
//        System.out.println(s1.equals( s2 ));
        /**
         * value: char[] value
         *  public boolean equals(Object anObject) {
         *        //如果是同一块内存，就返回true
         *        if (this == anObject) {
         *             return true;
         *         }
         *         //判断该对象是否是String类型的对象
         *         if (anObject instanceof String) {
         *         //转为String类型
         *             String anotherString = (String)anObject;
         *            //当前对象数组的长度
         *            int n = value.length;
         *             if (n == anotherString.value.length) {
         *                //当前对象的数组
         *                 char v1[] = value;
         *                 //获得传入字符串的数组
         *                 char v2[] = anotherString.value;
         *                 int i = 0;
         *                 //循环比较字符串的内容
         *                 while (n-- != 0) {
         *                     if (v1[i] != v2[i])
         *                         return false;
         *                     i++;
         *                 }
         *                 return true;
         *             }
         *         }
         *         return false;
         *     }
         */

    }
    class Person{
        String name;
    }
    @Test
    public  void test(){
        Person p1 = new Person();
        p1.name = "atguigu";

        Person p2 = new Person();
        p2.name ="atguigu";

        System.out.println(p1==p2);//false
        System.out.println(p1.equals(p2));//false

        System.out.println(p1.name .equals( p2.name));//true
        System.out.println(p1.name == p2.name);//true
        System.out.println(p1.name == "atguigu");//true

    }
}