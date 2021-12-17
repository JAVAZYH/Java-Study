package zyh.test.day14.exer2;

/*
 * 编写一个Employee类，声明为抽象类，
包含如下三个属性：name，id，salary。
提供必要的构造器和抽象方法：work()。
对于Manager类来说，他既是员工，还具有奖金(bonus)的属性。
请使用继承的思想，设计CommonEmployee类和Manager类，要求类中提供必要的方法进行属性访问。

 */

class CommonEmployee extends Employee{

	/*
	 * 通过构造器给父类中的属性赋值
	 */
	public CommonEmployee(String name, int id, double salary) {
		super(name, id, salary);
	}

	@Override
	public void work() {
		System.out.println(name + " " + id + " " + salary);
	}
	
}

class Manager extends Employee{

	double bonus;
	
	public Manager(String name, int id, double salary,double bonus) {
		super(name, id, salary);
		this.bonus = bonus;
	}

	@Override
	public void work() {
		System.out.println(name + " " + id + " " + salary + " " + bonus);
	}
	
}
abstract class Employee{
	String name;
	int id;
	double salary;
	
	public Employee(String name, int id, double salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	
	public abstract void work();
}



public class EmployeeTest {

	public static void main(String[] args) {
		Employee e = new CommonEmployee("宏哥", 1000, 100);
		e.work();
		
		Employee e2 = new Manager("小龙哥", 100, 100000, 200000);
		e2.work();
	}
}
