package zyh.test.day14.java2;

import org.junit.Test;

/*
 	模板设计模式：
 	
 	解决的问题：
		当功能内部一部分实现是确定的，一部分实现是不确定的。这时可以把不确定的部分暴露出去，让子类去实现。
		
	注意 ：相同的步骤放在抽象父类中，不同的步骤让子类去实现。

 */
/*
 * 需求 ：计算10000以内奇数这个代码的执行时间
 */
class Odd extends Computer {
	@Override
	public void runCode() {
		// 2.执行的代码
		for (int i = 1; i <= 10000; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
	}

}

class Even extends Computer {

	@Override
	public void runCode() {
		// 2.执行的代码
		for (int i = 1; i <= 10000; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}

}

abstract class Computer {

	public void runTime() {
		// 1.获取代码执行开始的时间。从当前时间到1970年1月1日所经历的毫秒数（当前时间所对应的毫秒数）
		long start = System.currentTimeMillis();
		// 2.执行的代码
		this.runCode();
		// 3.获取代码执行结束的时间
		long end = System.currentTimeMillis();
		// 4.计算代码运行的时间
		System.out.println("time=" + (end - start));
	}

	public abstract void runCode();
}

public class TemplateMethodTest {

	@Test
	public void test() {
		// 多态 ：父类的引用指向子类的对象。编译看左边，运行看右边
		Computer c = new Even(); // 多态
		c.runTime();
	}
}
