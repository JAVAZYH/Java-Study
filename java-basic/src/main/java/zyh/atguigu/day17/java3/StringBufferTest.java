package zyh.atguigu.day17.java3;

import org.junit.Test;

import java.util.Arrays;

/*
 	
 	字符串相关的类：
 	
 	[面试题]String,StringBuffer,StringBuilder的区别？
 	
      一  String: 不可变的字符序列。
 	StringBuffer: 可变的字符序列 ，底层是一个char[],线程安全的，效率低
 	StringBuilder: 可变的字符序列,底层是一个char[],线程不安全的，效率高
 	
 	
 	二  StringBuffer的构造器
 		new StringBuffer(); //底层创建了一个长度为16的char[]
 		new StringBuffer(30);//底层创建了一个指定长度的数组。
 		new StringBuffer("aaaaa"); //底层创建了一个长度为（16 + 字符串长 度）的数组，同时将字符串内容添加到当前字符串中
 	
 	三 StringBuffer的底层实现（扩容）：
 		当我们通过空参的构造器创建一个对象时，底层会默认创建一个长度为16的数组。当我们向数组中存放第17个元素时，
 		底层会进行扩容，扩容为原来数组的2倍+2.再将原数组中的元素复制到新的数组中。
 */
public class StringBufferTest {
	
	/*
	 * Arrays.copyOf()
	 */
	@Test
	public void test3(){
		
		int[] numbers = {1,2,3,4};
		
		/*
		 * copyOf(int[] original, int newLength)
		 * 1.创建一个数组长度为newLength
		 * 2.将original数组中的内容复制到新的数组中
		 */
		int[] copyOf = Arrays.copyOf(numbers, 10);
		//输出数组中的内容
		System.out.println(Arrays.toString(copyOf));
		//输出数组的长度
		System.out.println(copyOf.length);
	}
	
	/**
	 * StringBuffer构造器
	 * 
	 * new StringBuffer(); //底层创建了一个长度为16的char[]
	 * new StringBuffer(30);//底层创建了一个指定长度的数组。
	 * new StringBuffer("aaaaa"); //底层创建了一个长度为（16 + 字符串长 度）的数组，同时将字符串内容添加到当前字符串中
	 */
	@Test
	public void test2(){
		
		StringBuffer sb = new StringBuffer(); //底层创建了一个长度为16的char[]
		sb = new StringBuffer(30);//底层创建了一个指定长度的数组。
		sb = new StringBuffer("aaaaa"); //底层创建了一个长度为（16 + 字符串长 度）的数组，同时将字符串内容添加到当前字符串中
		sb.append("aaaaaaaaaaaaaaaaa");
		
		System.out.println(sb);
		System.out.println(sb.length()); //字符串的长度
	}

	/*
	 *  StringBuffer API :
	 *  StringBuffer append(xxx)：提供了很多的append()方法，用于进行字符串拼接
		StringBuffer delete(int start,int end)：删除指定位置的内容
		StringBuffer replace(int start, int end, String str)：把[start,end)位置替换为str
		StringBuffer insert(int offset, xxx)：在指定位置插入xxx
		StringBuffer reverse() ：把当前字符序列逆转
		public int indexOf(String str) ：  在当前字符中str首次出现的位置（从左到右）
		public String substring(int start,int end) ：将当前字符串start到end位置上的元素截取成子串（包头不包尾）
		public int length() : 字符串长度
		public char charAt(int n ) ：获取当前字符串指定索引位置上的字符
		public void setCharAt(int n ,char ch) : 将当前字符串中n索引位置上的元素替换成ch
	 */
	@Test
	public void test(){
		StringBuffer sb = new StringBuffer();
		//将内容添加到字符串中
		sb.append("abcdefg");
//		sb.append(true);
//		String str = null;
//		sb.append(str);
		
		//StringBuffer delete(int start,int end)：删除指定位置的内容(包头不包尾)
//		sb.delete(0, 2);
		
		//StringBuffer replace(int start, int end, String str)：把[start,end)位置替换为str(包头不包尾)
//		sb.replace(0, 2, "A");
		
		//StringBuffer insert(int offset, xxx)：在指定位置插入xxx
//		sb.insert(0, "AAAAAAA");
		
		//StringBuffer reverse() ：把当前字符序列逆转
//		sb.reverse();
		
		// indexOf(String str) : 在当前字符中str首次出现的位置（从左到右）
//		int index = sb.indexOf("abc");
//		System.out.println("index=" + index);
		
		//substring(int start,int end) : 将当前字符串start到end位置上的元素截取成子串（包头不包尾）
//		String str = sb.substring(0, 2);
		
		//setCharAt(int n ,char ch)将当前字符串中n索引位置上的元素替换成ch
		sb.setCharAt(0, 'A');
		
		
		System.out.println(sb);
		//字符串的长度
//		System.out.println(sb.length());
		
		
	}
}




















