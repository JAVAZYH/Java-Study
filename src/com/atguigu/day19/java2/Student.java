package com.atguigu.day19.java2;

public class Student implements Comparable {

	String name;
	int age;
	
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	
	@Override
	public String toString() {
		return "(" + name + age + ")";
	}



	@Override
	public int compareTo(Object o) {
		//安年纪排序
		if(o instanceof Student){
			Student s = (Student) o; //向下转型
			
//			return this.age - s.age; //从小到大排序
//			return -(this.age - s.age); //从大到小排序
			
			//安照名字排序
//			return this.name.compareTo(s.name);
			
			//需求：如果名字一样则安照年纪排序
			int n = this.name.compareTo(s.name);
			
			if(n == 0){//说明名字相同
				
				return this.age - s.age;//安年纪排序
			}
			
			return n;
		}
		return 0;//0表示的是内容相同
	}
	
}










