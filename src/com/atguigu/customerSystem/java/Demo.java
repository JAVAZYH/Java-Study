package com.atguigu.customerSystem.java;

public class Demo {

	public static void main(String[] args) {
		
		//如果键盘没有输入数据，那么读取'c'。如果键盘输入了数据那么就读取键盘输入的数据
		char readChar = CMUtility.readChar('c');
		System.out.println("readchar=" + readChar);
	}
}
