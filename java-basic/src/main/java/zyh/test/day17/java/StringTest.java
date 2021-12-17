package zyh.test.day17.java;

import org.junit.Test;

/*
 	String类:
 	
 	说明：
 		1.String被final所修饰，该类不能被继承。
 		2.实现了java.io.Serializable： 实现了该接口的类的对象可以序列化和反序列化。
 				 Comparable ： 用来比较内容。
 				 CharSequence ： 就可以获取字符串的长度，获取指定索引位置上的字符等操作
 		3.String的底层实际上就是一个char[],而且该数组被final所修饰。
 		4.String是不可变的字符序列
 		
 	 [面试题] ： String str = new String("xyz")创建了几个对象？
 	 				2个对象 ： 一个是常量池中的,还有一个是堆中的.
 */
public class StringTest {
	
	/*
	 * 练习 : 一共创建了几个对象？
	 */
	@Test
	public void test6(){
		
		String str = "hello";
		String str2 = "java";
		String str3 = "a";
		@SuppressWarnings("unused")
		
		//两个对象 ： 一个是new String("hellojavaa");
		//另一个是常量池中的  "hellojavaa"
		String str4 = str + str2 + str3;
			
	}
	
	
	/*
	 * 总结 ：只要有变量参与字符串的运算（字符串拼接），那么就会调用StringBuilder中的toString方法
	 * 			在方法中new String(结果)然后赋值给变量。
	 * 
	 * 说明： 只要有变量参与字符串的运算，那么就会在堆中开辟一块空间，将堆中的该地址值赋值给变量。
	 */
	@Test
	public void test5(){
		
		String str1 = "hellojava";
		String str2 = "hello" + "java"; //"hellojava"
		String str3 = "hello";
		String str4 = "java";
		String str5 = "hello" + str4;//new String("hellojava");
		String str6 = str3 + "java";//new String("hellojava");
		String str7 = str3 + str4;//new String("hellojava");
		
		System.out.println(str1 == str2);//true
		System.out.println(str1 == str5);//false
		System.out.println(str1 == str6);//false
		System.out.println(str1 == str7);//false
		System.out.println(str5 == str6);//false
		
		System.out.println("------------------------------------------------");
		
		//直接去常量池中查找(str3 + str4)结果的内容的对象的地址值。如果存在则值接返回该对象的地址值。
        //				如果不存在则创建新的对象
		String str8 = (str3 + str4).intern();
		System.out.println(str1 == str8);
	}
	
	/*
	 * 练习
	 */
	@Test
	public void test4(){
		Person p1 = new Person("aaa");
		Person p2 = new Person("aaa");
		System.out.println(p1.name == p2.name); //true
	}
	
	/*
	 * String是不可变的字符序列 (String的内容无法修改)：
	 * 		就算重新赋值，或者使用方法对字符串的内容进行修改，都不会改变原来字符串的内容。
	 */
	@Test
	public void test2(){
		//就算重写对变量进行赋值，也没有修改原来字符串的内容
		String str = "hello";
		String str2 = "hello";
		System.out.println(str == str2);//true
		str2 = "java"; //将str2中的地址值修改了，并非是改的内容。
		System.out.println(str == str2);//false
		
		System.out.println("--------------------------------");
		
		//就算使用方法对字符串中其中的某个字符进行修改，也没有修改原来字符串的内容
		String str3 = "java";
		String str4 = "java";
		System.out.println(str3 == str4);//true
		str4 = str4.replace('j', 'J');
		System.out.println("str4=" + str4);
		System.out.println(str3 == str4);//false
	}
	

	/*
	 * String实例化（创建对象）的方式：
	 */
	@Test
	public void test(){
		//第一种方式
		String str = "aaaa";
		String str3 = "aaaa";
		
		//第二种方式
		String str2 = new String("cccc");
		String str4 = new String("cccc");
		
		/*
		 *  == : 左右两边如果为引用数据类型，用来判断两个对象的地址值是否相同
		 */
		System.out.println(str == str3);//true
		System.out.println(str2 == str4);//false
	}
	
	/*
	 * demo
	 */
	@Test
	public void test3(){
		
		Person p = new Person("aaa");
		
		Person p3 = p;
		
		p3.name = "ccc"; //只是将地址值指向的那块内存中的属性进行了修改。
		
		System.out.println(p == p3);
		
//		Person p2 = new Person("aaa");
		
		p3 = new Person("aaa"); //将原来p3中的地址值进行了修改。
		
		System.out.println(p == p3);
	}
}



















