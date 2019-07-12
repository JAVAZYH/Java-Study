package com.atguigu.day19.java2;

public class Person {

	String name;
	int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	
	
	/*
	 * 
	 * 用来计算数据存放的位置
	 * 
	 * 重写HashCode方法的原则：
	 *  1.在程序运行时，同一个对象多次调用 hashCode() 方法应该返回相同的值。
		2.当两个对象的 equals() 方法比较返回 true 时，这两个对象的 hashCode() 方法的返回值也应相等。
		3.对象中用作 equals() 方法比较的 Field，都应该用来计算 hashCode 值。

	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	/*
	 * 比较内容
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "(" + name + age + ")";
	}
	
}
