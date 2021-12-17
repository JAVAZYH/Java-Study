package zyh.test.day19.java2;

import org.junit.Test;

import java.util.Comparator;
import java.util.TreeSet;

public class SetTest2 {
	
	/*
	 * 定制排序
	 * 
	 * 1.创建Comparator接口实现类的对象
	 * 2.重写compare方法
	 * 3.在compare方法中安照指定的属性进行排序
	 * 4.将Comparator实现类的对象作为实参传入到TreeSet的构造器中
	 * 5.向该集合中添加元素即可
	 */
	@Test
	public void test3(){
		
		Comparator comparator = new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				if(o1 instanceof Animal && o2 instanceof Animal){
					Animal a1 = (Animal) o1;
					Animal a2 = (Animal) o2;
					//安年纪排序
					return a1.age - a2.age;
				}
				return 0;
			}
		};
		
		TreeSet set = new TreeSet(comparator);
		
		set.add(new Animal("cc", 5));
		set.add(new Animal("bb", 3));
		set.add(new Animal("dd", 2));
		set.add(new Animal("aa", 6));
		
		System.out.println(set);
	}

	/*
	 	TreeSet: 可以对集合中的元素进行排序
	 	
	 	说明：
	 		1.TreeSet中添加的元素的类型应该保持一致。
	 		2.TreeSet底层的数据结构是红黑树。
	 		
	 	排序的方法 ：自然排序  vs 定制排序
	 	
	 	注意 ：对中文不能进行排序。
	 	
	 	自然排序：
	 		1.自定义的类实现Comparable接口
	 		2.重写compareTo方法
	 		3.在compareTo方法中对需要排序的属性进行排序即可
	 		4.向集合中添加元素即可。
	 		
	 	
	 	思考：定制排序和自然排序都存在的情况下谁起作用？
	 		 定制排序和自然排序哪个更灵活？
	 */
	
	@Test
	public void test2(){
		TreeSet set = new TreeSet();
		set.add(new Student("aa", 18));
		set.add(new Student("aa", 8));
		set.add(new Student("aa", 12));
		set.add(new Student("aa", 13));
		set.add(new Student("ff", 28));
		set.add(new Student("cc", 16));
		set.add(new Student("dd", 38));
		
		System.out.println(set);
	}
	
	
	@Test
	public void test(){
		
		TreeSet set = new TreeSet();
		/*
		set.add("aaa");
		set.add("fff");
		set.add("ccc");
		set.add("ddd");
		*/
		set.add(11);
		set.add(10);
		set.add(9);
		set.add(20);
		
		
		System.out.println(set);
	}
}
