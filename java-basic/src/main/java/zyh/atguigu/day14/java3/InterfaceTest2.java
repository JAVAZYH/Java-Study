package zyh.atguigu.day14.java3;

/*
 	接口和类之间的多态性。InterfaceTest2.java
 */
public class InterfaceTest2 {

	public static void main(String[] args) {
		
		Phone phone = new Phone();
		useTest(phone);
		Computer computer = new Computer();
		useTest(computer);
		
		System.out.println("---------------------");
		
		//接口的引用指向实现类的对象 - 接口和类之间的多态性
		ITest tt = new Computer();
		//向下转型 ： 为了调用实现类中独有的方法
		Computer cpt = (Computer)tt;
		cpt.run(); //调用实现类中独有的方法
		
		
		ITest tt2 = new Phone();
		
		System.out.println("---------------------");
		
		
	}
	
	public static void useTest(ITest t){
		t.test();
		//测试了一百项功能--------------------
	}
	
	/*
	public static void useTest(Phone c){
		c.FileTest();
		//测试了一百项功能--------------------
	}
	
	public static void useTest(Computer c){
		c.FileTest();
		//测试了一百项功能--------------------
	}
	*/
}

interface ITest{
	void test();
}

class Phone implements ITest{

	@Override
	public void test() {
		System.out.println("手机测试中");
	}
}

class Computer implements ITest{

	@Override
	public void test() {
		System.out.println("电脑测试中");
	}
	
	public void run(){
		System.out.println("电脑运行起来了");
	}
}
