package zyh.test.day14.java3;

/*
 	接口（Interface）:
 	
 	格式 ： interface 接口名{
 			
 		 }
 		 
 	说明：
 		1.类和接口是并列的关系
 		2.接口在jdk1.8之前只能有抽象方法和常量
 		3.接口和接口是继承关系而且是多继承 ： 接口1 extends 接口2，接口3 .....
 		4.接口和类的关系是实现而且是多实现 ： 类 implements 接口1，接口2......
 		5.当一个类实现接口后必须重写接口中所有的抽象方法。
 				如果该类不想重写接口中的方法那么可以将类用abstrcat修饰
 		6.接口和类之间的多态性。InterfaceTest2.java
 */
public class InterfaceTest {

	public static void main(String[] args) {
		//调用接口中的常量 ：接口名.常量名
		System.out.println(IEnglish.AGE);
	}

}

interface IA{
	void test();
}

interface IB{
	void demo();
}
//接口和接口是继承关系而且是多继承
interface IEnglish extends IA,IB{
	//常量
	public static final int AGE = 10;
	//常量
	String name = "person"; //默认省略了public static final
	
	//抽象方法
	public abstract void say();
	//抽象方法
	void show(); //默认省略了public abstract
}

//接口和类是实现的关系，而且可以多实现
class Person implements IA,IB{ //如果该类不想重写接口中的方法那么可以将类用abstrcat修饰

	@Override
	public void test() {
		
	}

	@Override
	public void demo() {
		
	}
}















