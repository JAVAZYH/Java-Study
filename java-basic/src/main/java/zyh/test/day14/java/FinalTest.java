package zyh.test.day14.java;

/*
 	final关键字 ：
 	
 	[面试题]final关键字的使用？
 	
 	final修饰类：final修饰的类不能被继承。比如 ：String,StringBuilder等类
 	
 	final修饰方法：final修饰的方法不能被重写
 	
 	final修饰变量：final修饰的变量的值不能被修改，所以final修饰的变量我们叫做常量
 			例 ：   public static final double PI = 3.14159265358979323846;
 			常量名 :XXX_YYY_ZZZ  - PERSON_NAME
 			
 			
 	final修饰的变量赋值的方式有 ： 构造器赋值，显示赋值,代码块赋值
 		
 	
 */


//The blank final field number may not have been initialized
//报错的原因 ：没有给final修饰的变量进行赋值
public class FinalTest {

	final int number;

	
	
	{
//		number = 10;
	}
	{
		
	}
	
	public FinalTest(){
		number = 10;
	}
	
	/*
	 * 注意 ： 无论如何都必须保证能给final修饰的变量赋上值
	 */
	public FinalTest(int a){
		this();
		
	}
	
	//通过方法给final修饰的变量赋值不可以，因为该方法可能永远不调用
	public void set(){
//		number = 20;
	}
	
}

/*
 * final修饰的类不能被继承 final class A{
 * 
 * }
 */

class A {

	/*
	 * final修饰的方法不能被重写
	public final void show() {

	}
	*/
	
	public  void show() {

	}
}

class B extends A {
	
	final int a = 10;
	
	public B(){
//		a = 20; final修饰的变量的值不能被修改，所以final修饰的变量我们叫做常量
	}
	
	public void show() {

	}
}
















