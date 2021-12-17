package zyh.test.day14.java;

/*
 	给属性赋值的方式 ： 1.默认值   2.显示赋值  3.构造器赋值   4.代码块   5.对象名.属性名、对象名.方法名
 	
 	赋值方式的顺序 ： 默认值 -> 显示赋值 、代码块赋值 -> 构造器赋值  -> 对象名.属性名、对象名.方法名
 	
 	注意 ： 显示赋值和代码块赋值谁在前谁先赋值。
 */
public class SetValue {

	public static void main(String[] args) {
		//代码是从上到下依次执行。
		new Number().show();
		
		int a;
		a = 5;
	}
}

class Number{
	public void show(){
		System.out.println(a);
	}
	
	/*
	 * 注意 ：在执行类加的时候，类中的成员加载的顺序不是从上到下。
	 */
	{
		a = 6;
	}
	{
		a = 6;
	}
	{
		a = 6;
	}
	
	
	//多个属性也是从上到下执行
	int a = 5;
	int b = a;
	
	static int c = 10;
	
	
	
	
}
