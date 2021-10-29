package zyh.atguigu.day14.exer;

class Teacher {
	public static void main(String[] args) {
		new Teacher("john");
		//静态代码块-类变量-非静态代码块-构造器
}

	String name;

	public Teacher(String string) {
		this.name = string;
		System.out.println("构造器：" + name);//4 7
	}

	static {
		System.out.println("嘿嘿");//1
	}
	
	 static Teacher t = new Teacher("鸠摩智");//2
//     Teacher t = new Teacher("鸠摩智");//2

	{
		System.out.println("哈哈哈：" + name);//3 6
	}
	
	static {
		System.out.println("呵呵");//5
	}
}
