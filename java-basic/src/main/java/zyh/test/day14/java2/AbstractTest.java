package zyh.test.day14.java2;

import org.junit.Test;

/*
 	关键字：abstract
 	
 	可以修饰 ：类和方法
 	
 	abstract修饰类 ：抽象类
 		1.抽象方法所在的类必须为抽象类
 		2.抽象类不能被实例化
 		3.思考 ：抽象类中有没有构造器？有 为了子类对象的实例化过程。
 		4.抽象类中可以有非抽象方法，可以有代码块，构造器，属性.....和普通的类的区别就在于是否可以实例化（是否有抽象方法）
 	
 	abstract修饰方法： 抽象方法
 		1.抽象方法没有方法体。
 		
 		(下面的两个知识点大家了解即可，因为IDE会提示你是否应该去重写。)
 		2.抽象子类不用重写抽象父类中的抽象方法。但是可以重写父类中的抽象方法，那么非抽象子类将不用再重写方该抽象方法。
 		3.一个非抽象子类继承抽象类必须重写抽象类中所有的抽象方法。
  			如果父类中重写了抽象方法那么非抽象子类就不用再重写该抽象方法了。
 	
 */

abstract class Math{
	
	private String name;
	
	{
		
	}
	
	
	public Math(){
		System.out.println("math");
	}
	public abstract void study();
	
	public void say(){
		
	}
}
/**
 * 抽象类：抽象方法所在的类必须为抽象类
 * 
 * 说明：
 * 		1.抽象子类不用重写抽象父类中的抽象方法。但是可以重写父类中的抽象方法，那么非抽象子类将不用再重写方该抽象方法。
 * 
 */
abstract class GeometricObject extends Math{ //几何图形
	public GeometricObject(){
		System.out.println("GeometricObject");
	}
	/**
	 * 求面积
	 * @return
	 */
	public abstract double findArea();//抽象方法：没有方法体
	
	@Override
	public void study() {
	
	}
	

}

/**
 * 创建一个子类继承抽象类
 * 
 * 说明:
 * 		1.一个非抽象子类继承抽象类必须重写抽象类中所有的抽象方法。
 * 			如果父类中重写了抽象方法那么非抽象子类就不用再重写该抽象方法了。
 */
abstract class Circle extends GeometricObject{

	/*
		如果该类不相重写抽象方法的两种解决方案：
		1.让父类去重写该方法
		2.让子类也用abstract进行修饰。变成抽象类。
	 */
	@Override
	public double findArea() {
		// TODO Auto-generated method stub
		return 0;
	}

	
}



public class AbstractTest {
	@Test
	public void test(){
		//注意 ：抽象类不能被实例化
//		new GeometricObject();
		
//		new Circle().equals("ccc");
	}
}

