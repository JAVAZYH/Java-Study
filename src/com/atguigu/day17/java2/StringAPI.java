package com.atguigu.day17.java2;

import org.junit.Test;

import java.util.Arrays;
public class StringAPI {
	/*
	 * 将字符串转成字符数组
	 */
	@Test
	public void test5(){
		//将字符串转成字符数组
		char[] charArray = "abcdefg".toCharArray();
		//将字符串数组转成字符串 -从数组的索引值为3开始截取一个长度为3的所有元素组成新的字符串
		String str = new String(charArray,3,3);
		System.out.println(str);
		
		System.out.println("--------------------------------------");
		
		//将字符串转成字节数组
		byte[] bytes = "abcdefg".getBytes();
		//将字节数组转成字符串
		String str2 = new String(bytes);
		
	}
	
	/*
	 * String[] split(String regex)：根据给定的匹配拆分此字符串。 
	 */
	@Test
	public void test4(){
		String str = "abc-ccc-d-e-f";
		String[] split = str.split("-");
		System.out.println(Arrays.toString(split));
	}
	
	/*
	 String replace(char oldChar, char newChar)：返回一个新的字符串，它是通过用 newChar 替换此字符串中出现的所有 oldChar 得到的。 
String replace(CharSequence target, CharSequence replacement)：使用指定的字面值替换序列替换此字符串所有匹配字面值目标序列的子字符串。 
String replaceAll(String regex, String replacement)：使用给定的 replacement 替换此字符串所有匹配给定的正则表达式的子字符串。 
String replaceFirst(String regex, String replacement)：使用给定的 replacement 替换此字符串匹配给定的正则表达式的第一个子字符串。 

	 */
	@Test
	public void test3(){
		//replace(char oldChar, char newChar)：将当前字符串中的oldChar替换成newChar
		System.out.println("abcdefaaaa".replace('a', 'A'));
		//replaceAll(String regex, String replacement) ：将当前字符串中regex替换成replacement
		System.out.println("abcdef".replaceAll("abc", "a"));
		//replaceFirst(String regex, String replacement)：将字符串中regex替换成replacement(只替换第一个)
		System.out.println("abcaaaaaaaaaaaaaa".replaceFirst("a", "A"));
	}
	
	/*
	 boolean endsWith(String suffix)：测试此字符串是否以指定的后缀结束 
boolean startsWith(String prefix)：测试此字符串是否以指定的前缀开始 
boolean startsWith(String prefix, int toffset)：测试此字符串从指定索引开始的子字符串是否以指定前缀开始
boolean contains(CharSequence s)：当且仅当此字符串包含指定的 char 值序列时，返回 true
int indexOf(String str)：返回指定子字符串在此字符串中第一次出现处的索引 
int indexOf(String str, int fromIndex)：返回指定子字符串在此字符串中第一次出现处的索引，从指定的索引开始 
int lastIndexOf(String str)：返回指定子字符串在此字符串中最右边出现处的索引 
int lastIndexOf(String str, int fromIndex)：返回指定子字符串在此字符串中最后一次出现处的索引，从指定的索引开始反向搜索 
注：indexOf和lastIndexOf方法如果未找到都是返回-1

	 */
	@Test
	public void test2(){
		// endsWith(String suffix) :当前字符串是否以suffix结尾
		System.out.println("abcdefg".endsWith("ffg"));
		// startsWith(String prefix): 当前字符串是否以prefix开头
		System.out.println("abcdefg".startsWith("abc"));
		//startsWith(String prefix, int toffset) 从当前字符串中指定的位置（toffset）开始是否以prefix开头
		System.out.println("abcdefg".startsWith("def",3));
		//contains(CharSequence s) 当前字符串是否包含s
		System.out.println("abcdefg".contains("def"));
		System.out.println("-----------------------------------");
		
		//下面的四个方法只要找不到那么返回-1
		//indexOf(String str) : str在当前字符串中第一次出现的位置 （从左到右）
		System.out.println("abdddddddddd".indexOf("abc"));
		//indexOf(String str, int fromIndex)：从当前字符串fromIndex位置开始，str第一次出现的位置（从左到右）
		System.out.println("ccccabcdefabc".indexOf("abc",7));
		//lastIndexOf(String str)str在当前字符串中第一次出现的位置 （从右到左）
		System.out.println("ccccabcdefabc".lastIndexOf("abc"));
		//lastIndexOf(String str, int fromIndex)：从当前字符串fromIndex位置开始，str第一次出现的位置（从右到左）
		System.out.println("ccccabcdefabc".lastIndexOf("abc",9));
	}

	/*
int length()：返回字符串的长度： return value.length
char charAt(int index)： 返回某索引处的字符return value[index]
boolean isEmpty()：判断是否是空字符串：return value.length == 0
String toLowerCase()：使用默认语言环境，将 String 中的所有字符转换为小写
String toUpperCase()：使用默认语言环境，将 String 中的所有字符转换为大写
String trim()：返回字符串的副本，忽略前导空白和尾部空白
boolean equals(Object obj)：比较字符串的内容是否相同
boolean equalsIgnoreCase(String anotherString)：与equals方法类似，忽略大小写
String concat(String str)：将指定字符串连接到此字符串的结尾。 等价于用“+”
String substring(int beginIndex)：返回一个新的字符串，它是此字符串的从beginIndex开始截取到最后的一个子字符串。 
返回一个新字符串，它是此字符串从beginIndex开始截取到endIndex(不包含)的一个子字符串。 
String substring(int beginIndex, int endIndex) ：

	 */
	@Test
	public void test(){
		//字符串的长度
		System.out.println("abc".length());
		//获取指定索引位置上的字符
		System.out.println("abc".charAt(0));
		//当前字符串是否为空字符串
		System.out.println("a".isEmpty());
		//将当前字符串的所有的内容转成大写
		System.out.println("abcAbCCC".toUpperCase());
		//将当前字符串的所有内容转为小写
		System.out.println("abcAbCCC".toLowerCase());
		//将字符串两端的空格去除
		System.out.println("    -abc   cccc-   ".trim());
		//比较两个字符串的内容，严格区分大小写
		System.out.println("abc".equals("Abc"));
		//比较两个字符串的内容。忽略大小写
		System.out.println("abc".equalsIgnoreCase("Abc"));
		//将连个字符串进行拼接相当于"+"
		System.out.println("abc".concat("ccc"));
		//从当前字符串中的指定索引位置开始  到最后一个字符 全部截取成新的子串
		System.out.println("abcdefg".substring(2));
		//substring(int beginIndex, int endIndex) 
		//将当前字符串中索引位置为beginIndex到endIndex所有的内容截取成新的子串（包头不包尾）
		System.out.println("abcdefg".substring(0, 3));//包头不包尾 [beginIndex,endIndex)
		
		
	}
	
	
}











