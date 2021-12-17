package zyh.test.day19.exer;

import java.util.Arrays;

import org.junit.Test;

public class StringDemo {

	@Test
	public void test(){
		
		String str = "cccccc";
		
		setString(str);
		
		System.out.println(str);
	}
	
	
	@Test
	public void test2(){
		
		char[] c = {'a','b','c'};
		
		setChar(c);
		
		System.out.println(Arrays.toString(c));
	}
	
	/*
	 * 改内容
	 */
	public void setChar(char[] c){
		c[0] = 'A';
	}
	
	/*
	 * 改的是地址值
	 */
	public void setString(String str){
		
		str = "aaa";
	}
}
